package com.rightside.findpulse;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextLogin, editTextSenha, editTextIdPulseira;
    private Button buttonLogar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextLogin = findViewById(R.id.editLogin);
        editTextSenha = findViewById(R.id.editSenha);
        editTextIdPulseira = findViewById(R.id.txtEditIdPulseira);
        buttonLogar = findViewById(R.id.buttonLogar);


        buttonLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int Login = Integer.parseInt(editTextLogin.getText().toString());
                int Senha = Integer.parseInt(editTextSenha.getText().toString());
                int IdPulseira = Integer.parseInt(editTextIdPulseira.getText().toString());



                if ((Login == 150797) && (Senha ==  123456) && (IdPulseira == 0001)) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                } else{
                    if(Login != 150797) {
                        Toast.makeText(LoginActivity.this, "Login Incorreto", Toast.LENGTH_SHORT).show();
                    }

                    if(Senha != 123456) {
                        Toast.makeText(LoginActivity.this, "Senha Incorreta", Toast.LENGTH_SHORT).show();
                    }
                    if (IdPulseira != 001) {
                        Toast.makeText(LoginActivity.this, "Id Incorreto", Toast.LENGTH_SHORT).show();
                    }
                }


            }

        });


    }

}
