package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RemoveUser extends AppCompatActivity {
    TextInputEditText user_to_remove;
    Button remove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_user);
        user_to_remove = findViewById(R.id.Info);
        remove = findViewById(R.id.remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper db= new DBHelper(RemoveUser.this);
                String mail = user_to_remove.getText().toString();
                if(mail.isEmpty())
                {
                    Toast.makeText(RemoveUser.this, "Try to fill the field !", Toast.LENGTH_SHORT).show();
                }
                else{
                db.RemoveUser(RemoveUser.this,mail);
                }
                user_to_remove.setText("");
            }
        });
    }
}