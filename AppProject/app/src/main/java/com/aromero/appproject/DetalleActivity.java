package com.aromero.appproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by User on 09/11/2016.
 */
public class DetalleActivity extends Activity {

    private ImageButton btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        app();
    }

    private void app() {
        btnMenu = (ImageButton) findViewById(R.id.btnMenu);
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
    }

    private void gotoMenuList() {
        startActivity(new Intent(this,MenuActivity.class));
    }
}
