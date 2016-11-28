package com.aromero.appproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.aromero.appproject.model.FestividadEntity;

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


}
