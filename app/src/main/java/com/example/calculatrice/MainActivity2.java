package com.example.calculatrice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
    TextInputEditText login;
    TextView Addtext;
    TextView RemoveText;
    TextInputEditText pwd;
    FloatingActionButton Add;
    FloatingActionButton Remove;
    FloatingActionButton Plus;
    Animation fade;
    Animation fade2;
    Button lgn;
    Button signUpWithG;
    private GoogleSignInClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lgn=findViewById(R.id.button_login);
        signUpWithG=findViewById(R.id.signInWithGoogle);
        Addtext= findViewById(R.id.AddText);
        RemoveText=findViewById(R.id.RemoveText);
        login = findViewById(R.id.Login);
        pwd = findViewById(R.id.Pwd);
        Add = findViewById(R.id.AddUser);
        Remove = findViewById(R.id.RemoveUser);
        Plus = findViewById(R.id.Plus);
        fade= AnimationUtils.loadAnimation(this,R.anim.fade);
        fade2= AnimationUtils.loadAnimation(this,R.anim.fade2);
        GoogleSignInOptions options= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client))
                .build();
        client= GoogleSignIn.getClient(this,options);
        FirebaseAuth.getInstance().signOut();
        client.signOut();
        signUpWithG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = client.getSignInIntent();
                startActivityForResult(i,1234);
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, NewUser.class);
                startActivity(intent);
            }
        });
        Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, RemoveUser.class);
                startActivity(intent);
            }
        });
        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add.setVisibility(View.VISIBLE);
                Addtext.setVisibility(View.VISIBLE);
                Remove.setVisibility(View.VISIBLE);
                RemoveText.setVisibility(View.VISIBLE);
                Add.startAnimation(fade);
                Remove.startAnimation(fade2);
                Addtext.startAnimation(fade);
                RemoveText.startAnimation(fade2);
                int[] location = new int[2];
                Plus.getLocationOnScreen(location);
            }
        });
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e_mail = login.getText().toString();
                String m_d_p = pwd.getText().toString();
                if(e_mail.isEmpty() || m_d_p.isEmpty())
                {
                    Toast.makeText(MainActivity2.this, "Make sure to fill every field !", Toast.LENGTH_SHORT).show();
                    login.setText("");
                    pwd.setText("");
                }
                else
                {
                    DBHelper db= new DBHelper(MainActivity2.this);
                    if(db.AlreadyExists(e_mail))
                    {
                        if(db.VerifyPwd(MainActivity2.this,m_d_p,e_mail)){
                        Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
                        startActivity(intent);
                        }
                        else{
                            Toast.makeText(MainActivity2.this,"The password is incorrect ! ",Toast.LENGTH_SHORT).show();
                            login.setText("");
                            pwd.setText("");
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity2.this,"This user doesn't exist ! Try Add User ", Toast.LENGTH_SHORT).show();
                        login.setText("");
                        pwd.setText("");
                    }
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1234){
            Task<GoogleSignInAccount> task= GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account= task.getResult(ApiException.class);
                AuthCredential credential= GoogleAuthProvider.getCredential(account.getIdToken(),null);
                FirebaseAuth.getInstance().signInWithCredential(credential)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Intent intent= new Intent(getApplicationContext(),MainActivity5.class);
                                    startActivity(intent);
                                }
                                else{
                                    Toast.makeText(MainActivity2.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
        if(user!=null){
            Intent intent= new Intent(this,MainActivity5.class);
            startActivity(intent);
        }
    }
}