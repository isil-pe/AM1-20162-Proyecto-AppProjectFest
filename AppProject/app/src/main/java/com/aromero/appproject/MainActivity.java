package com.aromero.appproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends Activity {

    private EditText txtEmail, txtPassword;
    private Button btnIniciarSesion,btnRecuperarPassword,btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        app();
        //ui();
    }

    private void app() {
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion);
        btnRecuperarPassword = (Button) findViewById(R.id.btnRecuperarPassword);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);
        events();
    }

    private void events() {


        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFormError()) {
                    if (validateLogin())
                    {
                        ui();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Revisar campos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.btnRegistrarse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegistro();
            }
        });
    }

    private void ui() {

        findViewById(R.id.btnIniciarSesion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoPrincipal();
            }
        });

       /* findViewById(R.id.btnRegistrarse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegistro();
            }
        });*/
    }

    private boolean validateFormError() {
        String email = txtEmail.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();

        if (email.isEmpty()) {
            txtEmail.setError("Campo inválido");
            return false;
        }
        if(!isEmailValid(email)){
            txtEmail.setError("E-mail inválido");
            return false;
        }
        if (password.isEmpty()) {
            txtPassword.setError("Campo inválido");
            return false;
        }
        if (email.isEmpty()) return false;
        if (password.isEmpty()) return false;

        return true;
    }

    public boolean isEmailValid(String email) {
        String regExpn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    private boolean validateLogin() {
        String email = txtEmail.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();

        if (!email.equals("aromero@gmail.com")) {
            txtEmail.setError("Email incorrecto");
            return false;
        }
        if (!password.equals("12345")) {
            txtPassword.setError("Contraseña incorrecta");
            return false;
        }
        if (email.isEmpty()) return false;
        if (password.isEmpty()) return false;

        return true;
    }

    private void gotoRegistro() {
        startActivity(new Intent(this,RegistroActivity.class));
    }
    private void gotoPrincipal() {
        startActivity(new Intent(this,PrincipalActivity.class));
    }
}
