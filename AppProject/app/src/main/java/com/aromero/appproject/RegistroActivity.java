package com.aromero.appproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 12/10/2016.
 */
public class RegistroActivity extends Activity {

    private EditText txtName2, txtEmail2, txtPassword2;
    private Button btnRegistrarse2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        app();
    }


    private void app() {
        txtName2 = (EditText) findViewById(R.id.txtName2);
        txtEmail2 = (EditText) findViewById(R.id.txtEmail2);
        txtPassword2 = (EditText) findViewById(R.id.txtPassword2);

        btnRegistrarse2 = (Button) findViewById(R.id.btnRegistrarse2);
        events();
    }

    private void events() {


        btnRegistrarse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFormError()) {

                }
                else
                {
                    Toast.makeText(RegistroActivity.this, "Revisar campos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateFormError() {
        String name = txtName2.getText().toString().trim();
        String email = txtEmail2.getText().toString().trim();
        String password = txtPassword2.getText().toString().trim();

        if (name.isEmpty()) {
            txtName2.setError("Campo inválido");
            return false;
        }
        if (email.isEmpty()) {
            txtEmail2.setError("Campo inválido");
            return false;
        }
        if(!isEmailValid(email)){
            txtEmail2.setError("E-mail inválido");
            return false;
        }
        if (password.isEmpty()) {
            txtPassword2.setError("Campo inválido");
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
}
