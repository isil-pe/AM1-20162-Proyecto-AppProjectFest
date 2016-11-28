package com.aromero.appproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aromero.appproject.R;
import com.aromero.appproject.model.FestividadEntity;

import java.util.List;

/**
 * Created by aromero on 21/11/2016.
 */
public class ListAdapter extends BaseAdapter {

    private int DESCLMAX=30;
    private Context context;
    private List<FestividadEntity> festividades;

    public ListAdapter(Context context, List<FestividadEntity> festividades) {
        this.context = context;
        this.festividades = festividades;
    }

    @Override
    public int getCount() {
        return festividades.size();
    }

    @Override
    public Object getItem(int i) {
        return festividades.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_list, null);
            ViewHolder holder = new ViewHolder();
            holder.iviPlace = (ImageView)v.findViewById(R.id.iviPlace);
            holder.tviNombre = (TextView) v.findViewById(R.id.tviNombre);
            holder.tviDesc = (TextView) v.findViewById(R.id.tviDesc);
            holder.tviFecha = (TextView) v.findViewById(R.id.tviFecha);
            holder.tviLugar = (TextView) v.findViewById(R.id.tviLugar);
            holder.tviClima= (TextView) v.findViewById(R.id.tviClima);
            holder.tviAltitud = (TextView) v.findViewById(R.id.tviAltitud);
            v.setTag(holder);
        }
        FestividadEntity entry = festividades.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            String nombre=entry.getNombre();
            String descripcion= entry.getDescripcion();
            if(descripcion.length()>=DESCLMAX) descripcion= descripcion.substring(0,DESCLMAX)+"...";

            //int ranking = entry.getPhoto();
            //int review=entry.getReviews();
            //int distancia= entry.getDistancia();
            String fecha=entry.getFecha();
            String lugar=entry.getLugar();
            String clima=entry.getClima();
            String altitud=entry.getAltitud();

            holder.iviPlace.setImageResource(entry.getPhoto());
            holder.tviNombre.setText(nombre);
            holder.tviDesc.setText(descripcion);

            /*holder.tviRanking.setText(""+ranking);
            ImageView iviStar1= (ImageView)v.findViewById(R.id.iviStar1);
            ImageView iviStar2= (ImageView)v.findViewById(R.id.iviStar2);
            ImageView iviStar3= (ImageView)v.findViewById(R.id.iviStar3);
            ImageView iviStar4= (ImageView)v.findViewById(R.id.iviStar4);
            ImageView iviStare1= (ImageView)v.findViewById(R.id.iviStare1);
            ImageView iviStare2= (ImageView)v.findViewById(R.id.iviStare2);
            ImageView iviStare3= (ImageView)v.findViewById(R.id.iviStare3);*/



            /*switch(ranking){
                case 1: iviStar1.setVisibility(View.VISIBLE);
                    iviStare1.setVisibility(View.VISIBLE);
                    iviStare2.setVisibility(View.VISIBLE);
                    iviStare3.setVisibility(View.VISIBLE);
                    iviStar2.setVisibility(View.GONE);
                    iviStar3.setVisibility(View.GONE);
                    iviStar4.setVisibility(View.GONE);
                    break;
                case 2: iviStar1.setVisibility(View.VISIBLE);
                    iviStar2.setVisibility(View.VISIBLE);
                    iviStare1.setVisibility(View.VISIBLE);
                    iviStare2.setVisibility(View.VISIBLE);
                    iviStar3.setVisibility(View.GONE);
                    iviStar4.setVisibility(View.GONE);
                    iviStare3.setVisibility(View.GONE);
                    break;
                case 3: iviStar1.setVisibility(View.VISIBLE);
                    iviStar2.setVisibility(View.VISIBLE);
                    iviStar3.setVisibility(View.VISIBLE);
                    iviStare1.setVisibility(View.VISIBLE);
                    iviStar4.setVisibility(View.GONE);
                    iviStare2.setVisibility(View.GONE);
                    iviStare3.setVisibility(View.GONE);
                    break;
                case 4: iviStar1.setVisibility(View.VISIBLE);
                    iviStar2.setVisibility(View.VISIBLE);
                    iviStar3.setVisibility(View.VISIBLE);
                    iviStar4.setVisibility(View.VISIBLE);
                    iviStare1.setVisibility(View.GONE);
                    iviStare2.setVisibility(View.GONE);
                    iviStare3.setVisibility(View.GONE);
                    break;
                default:iviStar1.setVisibility(View.GONE);
                    iviStar2.setVisibility(View.GONE);
                    iviStar3.setVisibility(View.GONE);
                    iviStar4.setVisibility(View.GONE);
                    iviStare1.setVisibility(View.GONE);
                    iviStare2.setVisibility(View.GONE);
                    iviStare3.setVisibility(View.GONE);
                    break;
            }*/



            // holder.iviPlace.setImageResource(entry.getPhoto());
            //holder.tviDesc1.setText(""+review + " REVIEWS");
            //holder.tviDesc2.setText(""+distancia + " m");
            holder.tviFecha.setText(fecha);
            holder.tviLugar.setText(lugar);
            holder.tviClima.setText(clima);
            holder.tviAltitud.setText(altitud);



            //holder.tviTitle.setBackgroundColor(Color.parseColor(entry.getHeaderColor()));
        }



        return v;
    }

    static class ViewHolder
    {
        ImageView iviPlace;
        TextView tviNombre;
        TextView tviDesc;
        TextView tviFecha;
        TextView tviLugar;
        TextView tviClima;
        TextView tviAltitud;
    }
}
