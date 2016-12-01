package com.aromero.appproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.aromero.appproject.storage.Menu;

/**
 * Created by User on 07/11/2016.
 */
public class MenuActivity extends Activity {

    private ImageButton btnMenu, btnLogo;
    private String[] mStrings = Menu.sMenuStrings;
    private int  tipo = 0;
    private ListView lvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        app();


            lvMenu=(ListView)findViewById(R.id.lvMenu);

            lvMenu.setAdapter(new ArrayAdapter<String>(this,
                    R.layout.my_row_menu, mStrings));
            lvMenu.setTextFilterEnabled(true);


        //events
        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value= String.valueOf(adapterView.getAdapter().getItem(position));
                        //+" " +String.valueOf(position);
                showItem(value);
                if(position==0)
                {
                    tipo = 1;
                    gotoList();
                    gotoMain();
                }
                if(position==1)
                {
                    tipo = 2;
                    gotoList();
                    gotoMain();
                }
                if(position==2)
                {
                    tipo = 3;
                    gotoList();
                    gotoMain();
                }
                if(position==3)
                {
                    tipo = 4;
                    gotoList();
                    gotoMain();
                }
                if(position==4)
                {
                    tipo = 5;
                    gotoList();
                    gotoMain();
                }
                if(position==5)
                {
                    tipo = 6;
                    gotoList();
                    gotoMain();
                }
            }
        });
    }

    private void app() {
        btnMenu = (ImageButton) findViewById(R.id.btnMenu);
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

    }

    private void showItem(String value) {

        Toast.makeText(this,""+value,Toast.LENGTH_SHORT).show();
    }

    private void gotoMenuList() {
        startActivity(new Intent(this,MenuActivity.class));
    }
    /*private void gotoFCivicas() {
        startActivity(new Intent(this,FiestasCivicasActivity.class));
    }*/

    private void gotoHome() {
        startActivity(new Intent(this,PrincipalActivity.class));
    }

    private void gotoList() {
        //startActivity(new Intent(this,ListActivity.class));
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("tipo", tipo);
        startActivity(intent);
    }

    private void gotoMain() {
        finish();
    }
}
