package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class NewUser extends AppCompatActivity {
    TextInputEditText email;
    TextInputEditText mdp;
    TextInputEditText nom;
    TextInputEditText prenom;
    Button ajouter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        email = findViewById(R.id.mail);
        mdp = findViewById(R.id.mdp);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prénom);
        ajouter= findViewById(R.id.Ajouter);
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    String Nom =nom.getText().toString();
                    String Prenom = prenom.getText().toString();
                    String PWD = mdp.getText().toString();
                    String Email = email.getText().toString();
                    if(Nom.isEmpty() || Prenom.isEmpty() || PWD.isEmpty() || Email.isEmpty()){
                        Toast.makeText(NewUser.this, "There's an empty field ! Try again", Toast.LENGTH_SHORT).show();
                        nom.setText("");
                        prenom.setText("");
                        mdp.setText("");
                        email.setText("");
                    }
                    else{
                    User user = new User(Nom,Prenom,PWD,Email);
                    DBHelper dbHelper= new DBHelper(NewUser.this);
                    dbHelper.AddUser(NewUser.this,user);
                    nom.setText("");
                    prenom.setText("");
                    mdp.setText("");
                    email.setText("");
                    }
            }
        });

    }
}