package com.aromero.appproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by User on 12/10/2016.
 */
public class PrincipalActivity extends Activity {

    private ImageButton btnMenu, btnFCivicas, btnFDepartamento, btnLogo;
    int tipo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_principal);
        app();
    }

    private void app() {
        btnMenu = (ImageButton) findViewById(R.id.btnMenu);
        btnFCivicas = (ImageButton) findViewById(R.id.btnFCivicas);
        btnFDepartamento = (ImageButton) findViewById(R.id.btnFDepartamento);
        btnLogo = (ImageButton) findViewById(R.id.btnLogo);
        events();
    }



    private void events()
    {
        findViewById(R.id.btnMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMenuList();
            }
        });

        findViewById(R.id.btnLogo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoHome();
            }
        });

        findViewById(R.id.btnFCivicas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = 1;
                gotoList();
            }
        });

        findViewById(R.id.btnFReligiosa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = 2;
                gotoList();
            }
        });

        findViewById(R.id.btnFDepartamento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = 3;
                gotoList();
            }
        });

        findViewById(R.id.btnFMes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = 4;
                gotoList();
            }
        });

        findViewById(R.id.btnFGastronomica).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = 5;
                gotoList();
            }
        });

        findViewById(R.id.btnFavoritos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = 6;
                gotoList();
            }
        });
    }

    private void gotoMenuList() {
        startActivity(new Intent(this,MenuActivity.class));
    }

    private void gotoHome() {
        startActivity(new Intent(this,PrincipalActivity.class));
    }

    private void gotoList() {
        //startActivity(new Intent(this,ListActivity.class));
        Intent intent = new Intent(PrincipalActivity.this, ListActivity.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }


}


