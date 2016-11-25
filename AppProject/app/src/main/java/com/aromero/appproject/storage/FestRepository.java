package com.aromero.appproject.storage;

import com.aromero.appproject.R;
import com.aromero.appproject.model.FestividadEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by aromero on 21/11/2016.
 */
public class FestRepository {

    private List<FestividadEntity> festividad;

    public FestRepository() {
        festividad = new ArrayList<FestividadEntity>();
    }

    public void mock() {

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();

        FestividadEntity festividad1= new FestividadEntity(1,"Fiestas Patrias",R.drawable.fest11_200x200,"Fiestas patrias del Perú",
                "Del 28 al 29 de julio","Todo pais","Nublado","10 m.s.n.m.",1);
        FestividadEntity festividad2= new FestividadEntity(2,"Aniversario del distrito de Barranco",R.drawable.fest11_200x200,
                "En el marco por el aniversario del distrito de Barranco, la municipalidad prepara un listado de actividades para festejar a lo grande esta fecha especial.",
                "Del 14 al 30 de octubre","Lima","Nublado","10 m.s.n.m.",1);

        FestividadEntity festividad3= new FestividadEntity(3,"148° Aniversario de Creación Política y 55° Semana Turística de Chincha",
                R.drawable.fest11_200x200,
                "¡La cuna del folclore afroperuano está de fiesta! La provincia de Chincha cumple 148° años de su creación política, en el marco de la 55° Semana turística de la provincia, donde se ofrecerán una serie de actividades que  reunirán tanto a pobladores como a turistas.",
                "Del 17 al 24 de octubre","Ica","Templado","94 m.s.n.m.",1);

        FestividadEntity festividad4= new FestividadEntity(4,"148° Aniversario de Creación Política y 55° Semana Turística de Chincha",
                R.drawable.fest11_200x200,
                "¡La cuna del folclore afroperuano está de fiesta! La provincia de Chincha cumple 148° años de su creación política, en el marco de la 55° Semana turística de la provincia, donde se ofrecerán una serie de actividades que  reunirán tanto a pobladores como a turistas.",
                "Del 17 al 24 de octubre","Ica","Templado","94 m.s.n.m.",2);

        festividad.add(festividad1);
        festividad.add(festividad2);
        festividad.add(festividad3);
        festividad.add(festividad4);

    }

    public void addFestividad(FestividadEntity fest)
    {
        festividad.add(fest);
    }

    public List<FestividadEntity> allFestividades()
    {
        return this.festividad;
    }

    public int countPlaces()
    {
        return this.festividad.size();
    }
    public FestividadEntity lastFestividades()
    {
        if(this.festividad.size()>0)
        {
            return this.festividad.get(this.festividad.size()-1);
        }
        return null;
    }
}
