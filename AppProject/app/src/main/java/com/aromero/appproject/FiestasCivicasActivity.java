package com.aromero.appproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by User on 09/11/2016.
 */
public class FiestasCivicasActivity extends Activity {

    private ImageButton btnMenu, btnFCivica1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiestas_civicas);
        app();
    }

    private void app() {
        btnFCivica1 = (ImageButton) findViewById(R.id.btnFCivica1);
        btnMenu = (ImageButton) findViewById(R.id.btnMenu);
        events();
    }

    private void events()
    {
        findViewById(R.id.btnFCivica1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDetalle();
            }
        });

        findViewById(R.id.btnMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMenuList();
            }
        });
    }

    private void gotoDetalle() {
        startActivity(new Intent(this,DetalleActivity.class));
    }

    private void gotoMenuList() {
        startActivity(new Intent(this,MenuActivity.class));
    }
}
