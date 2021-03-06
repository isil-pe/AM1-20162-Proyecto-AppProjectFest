package com.aromero.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.aromero.appproject.adapter.ListAdapter;
import com.aromero.appproject.model.FestividadEntity;

import java.util.List;

/**
 * Created by aromero on 21/11/2016.
 */
public class ListActivity extends AppCompatActivity {

    private ImageButton btnMenu, btnLogo;
    private ListView lstFest;
    private List<FestividadEntity> festividades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_list);
        loadData();
        app();
    }

    private void app() {
        btnMenu = (ImageButton) findViewById(R.id.btnMenu);
        btnLogo = (ImageButton) findViewById(R.id.btnLogo);
        ui();
        events();
    }

    private void ui() {
        lstFest= (ListView)findViewById(R.id.lstFest);
    }

    private void events() {

        lstFest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                FestividadEntity festividad= (FestividadEntity) adapterView.getAdapter().getItem(position);
                gotoPlaceDetail(festividad);

            }
        });

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

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {

            ListAdapter festAdapter= new ListAdapter(this,festividades );
            lstFest.setAdapter(festAdapter);
    }

    private void gotoPlaceDetail(FestividadEntity festividad) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("PLACE",festividad);

        Intent intent = new Intent(ListActivity.this, FestActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void loadData() {

        //FestividadEntity festividadEntity = new FestividadEntity();
        Bundle datos = this.getIntent().getExtras();
        int tipo = datos.getInt("tipo");
        if(tipo ==1)
        {
            FestAplication application= (FestAplication)getApplication();
            //this.festividades= application.getPlaceRepository().allFestividades();
            this.festividades= application.getPlace2Repository().getFestByCategory(tipo);
        }
        if(tipo ==2)
        {
            FestAplication application= (FestAplication)getApplication();
            this.festividades= application.getPlace2Repository().getFestByCategory(tipo);
        }

        if(tipo ==3)
        {
            FestAplication application= (FestAplication)getApplication();
            this.festividades= application.getPlace2Repository().getFestByCategory(tipo);
        }

        if(tipo ==4)
        {
            FestAplication application= (FestAplication)getApplication();
            this.festividades= application.getPlace2Repository().getFestByCategory(tipo);
        }

        if(tipo ==5)
        {
            FestAplication application= (FestAplication)getApplication();
            this.festividades= application.getPlace2Repository().getFestByCategory(tipo);
        }

        if(tipo ==6)
        {
            FestAplication application= (FestAplication)getApplication();
            this.festividades= application.getPlace2Repository().getFestByCategory(tipo);
        }


    }

    private void gotoMenuList() {
        startActivity(new Intent(this,MenuActivity.class));
    }

    private void gotoHome() {
        startActivity(new Intent(this,PrincipalActivity.class));
    }
}
