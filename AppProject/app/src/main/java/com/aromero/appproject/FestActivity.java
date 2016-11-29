package com.aromero.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.aromero.appproject.model.FestividadEntity;

import java.util.Calendar;

/**
 * Created by aromero on 21/11/2016.
 */
public class FestActivity extends AppCompatActivity {

    private ImageView iviFoto;
    private TextView tviNombre;
    private TextView tviDesc;
    private TextView tviFecha;
    private TextView tviLugar;
    private TextView tviClima;
    private TextView tviAltitud;
    private FestividadEntity festividades;
    private ImageButton btnAdd, btnMenu,btnLogo;

    private int foto;
    private String nombre, desc, fecha, lugar, clima,altitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fest);

        extras();
        ui();
        populate();
    }

    private void extras() {
        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                festividades = (FestividadEntity) bundle.getSerializable("PLACE");
            }
        }
    }

    private void ui() {
        //iviStar1= (ImageView)findViewById(R.id.iviStar1);
        tviNombre= (TextView) findViewById(R.id.tviNombre);
        iviFoto= (ImageView)findViewById(R.id.iviPlace);
        tviDesc= (TextView) findViewById(R.id.tviDesc);
        tviFecha= (TextView) findViewById(R.id.tviFecha);
        tviLugar= (TextView) findViewById(R.id.tviLugar);
        tviClima= (TextView) findViewById(R.id.tviClima);
        tviAltitud= (TextView) findViewById(R.id.tviAltitud);
        btnAdd = (ImageButton) findViewById(R.id.btnAdd);
        btnMenu = (ImageButton) findViewById(R.id.btnMenu);
        btnLogo = (ImageButton) findViewById(R.id.btnLogo);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNote();
                //gotoMain();
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
                gotoMain();
            }
        });
    }

    private void populate() {
        if(festividades==null)return;
        tviNombre.setText(festividades.getNombre());
        tviDesc.setText(festividades.getDescripcion());
        tviFecha.setText(festividades.getFecha());
        tviLugar.setText(festividades.getLugar());
        iviFoto.setImageResource(festividades.getPhoto());
        //tviFecha.setText(""+(restaurantes.getReviews())+" Reviews");
        //tviLugar.setText(""+(restaurantes.getDistancia())+" m");
        tviClima.setText(festividades.getClima());
        tviAltitud.setText(festividades.getAltitud());
    }

    private void addNote() {

        FestAplication application= (FestAplication)getApplication();

        nombre= tviNombre.getText().toString().trim();
        foto = R.drawable.aniv_callao;
        desc= tviDesc.getText().toString().trim();
        fecha= tviFecha.getText().toString().trim();
        lugar= tviLugar.getText().toString().trim();
        clima= tviClima.getText().toString().trim();
        altitud= tviAltitud.getText().toString().trim();

        FestividadEntity last= application.getPlaceRepository().lastFestividades();
        int festId;
        if(last!=null)
        {
            festId= last.getId()+1;
        }else
        {
            festId=1;
        }
        FestividadEntity festEntity= new FestividadEntity(festId,nombre,foto,desc,fecha,lugar,clima,altitud,6);

        application.getPlaceRepository().addFestividad(festEntity);
    }

    private void gotoMenuList() {
        startActivity(new Intent(this,MenuActivity.class));
    }

    private void gotoHome() {
        startActivity(new Intent(this,PrincipalActivity.class));
    }

    private void gotoMain() {
        finish();
    }
}
