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

        //Fiestas CIVICAS
        FestividadEntity festividad1= new FestividadEntity(1,"Fiestas Patrias",R.drawable.fest11_620x180,
                "En todo el país se realizan fiestas y celebraciones patrióticas para recordar la declaración" +
                " de la Independencia del Perú (28 de julio de 1821). Tanto en Lima, como en las diversas ciudades" +
                " del Perú, e incluso en algunos pueblitos alejados, las casas lucen embanderadas desde los primeros días del mes.",
                "Del 28 al 29 de julio","Todo pais","Nublado","10 m.s.n.m.",1);

        FestividadEntity festividad2= new FestividadEntity(2,"Aniversario del distrito de Barranco",R.drawable.fest7_200x200,
                "En el marco por el aniversario del distrito de Barranco, la municipalidad prepara un listado de actividades " +
                 "para festejar a lo grande esta fecha especial.",
                "Del 14 al 30 de octubre","Lima","Nublado","10 m.s.n.m.",1);

        FestividadEntity festividad3= new FestividadEntity(3,"Aniv. de Creación y Semana Turística de Chincha",
                R.drawable.fest4_200x200,
                "¡La cuna del folclore afroperuano está de fiesta! La provincia de Chincha cumple " +
                        "148° años de su creación política, en el marco de la 55° Semana turística" +
                        " de la provincia, donde se ofrecerán una serie de actividades que  " +
                        "reunirán tanto a pobladores como a turistas.",
                "Del 17 al 24 de octubre","Ica","Templado","94 m.s.n.m.",1);

        FestividadEntity festividad4= new FestividadEntity(4,"Aniversario de la Batalla de Ayacucho",
                R.drawable.fest18_200x200,
                "La Batalla de Ayacucho fue uno de los actos bélicos más importantes de la" +
                        " historia y significó el final definitivo del dominio colonial español" +
                        " en América del Sur. Para homenajear y conmemorar a sus héroes, se " +
                        "desarrollan una serie de eventos donde destacan actividades deportivas y " +
                        "exposiciones.",
                "Del 4 al 9 de diciembre","Ayacucho","Templado","2,746 m.s.n.m.",1);

        FestividadEntity festividad5= new FestividadEntity(5,"Homenaje a los Defensores del Alto de la Alianza",
                R.drawable.fest19_200x200,
                "Se realiza un desfile y diversos actos cívicos en el Complejo Hotórico Monumental del Alto de la Alianza.",
                "26 de mayo del 2014","Tacna","Templado","",1);



        //Fiestas RELIGIOSAS
        FestividadEntity festividad6= new FestividadEntity(6,"San Francisco de Borja o 'Tata Pancho'",
                R.drawable.fest9_200x200,
                "La fiesta patronal de San Francisco de Borja, conocido por cientos de fieles de la" +
                        " ciudad puneña de Yunguyo como “Tata Pancho”, es celebrada cada año en " +
                        "el mes de noviembre y fue reconocida como Patrimonio Cultural de la Nación " +
                        "en el 2015.\n" + "Esta festividad reúne a cientos de personas en la Plaza" +
                        " Central de la ciudad para rendir homenaje a la santa escultura que es " +
                        "paseada al ritmo de trece comparsas a pocos metros del lago Titicaca, " +
                        "además de ir acompañada de danzantes con trajes de luces y bandas" +
                        " bolivianas de la ciudad de Copacabana.",
                "8 de noviembre","Puno","Templado","3.826 m.s.n.m.",2);

        FestividadEntity festividad7= new FestividadEntity(7,"Santísima Virgen del Rosario 'Mama Huarin'”",
                R.drawable.fest20_200x200,
                "Como todos los años, la región de Áncash es escenario de los más grandes " +
                        "acontecimientos festivos, las creencias y costumbres de los pobladores" +
                        " de Huari se ven reflejadas en el homenaje a la Santísima Virgen del" +
                        " Rosario, también conocida como “Mama Huarina”. Este acto de fe es " +
                        "celebrado en el mes de octubre, donde las danzas y el fervor se" +
                        " combinan con lo mejor de su historia y tradición.",
                "Del 6 al 9 de octubre","Ancash","","3.826 m.s.n.m.",2);

        FestividadEntity festividad8= new FestividadEntity(8,"Fiesta Patronal Señor de Gualamita",
                R.drawable.fest21_200x200,
                "El distrito de Lámud se encuentra a 1 hora de la ciudad de Chachapoyas; " +
                        "en la fiesta patronal del Señor de Gualamita se realizan procesiones, " +
                        "el tradicional Hueche (consiste en otorgar regalos a la localidad que " +
                        "se encuentra realizando o celebrando la festividad patronal); Festividad " +
                        "cultural “Hatún Luya”, albazo (tradicional inicio de las celebraciones del " +
                        "día), serenatas y fuegos artificiales, todas estas actividades en honor al" +
                        " Señor de Gualamita patrono de la región Amazonas.",
                "Del 1 al 14 de septiembre","Amazonas","Templado","",2);

        FestividadEntity festividad9= new FestividadEntity(9,"Fiesta Mayor del Señor de Ánimas de Apurímac",
                R.drawable.fest22_200x200,
                "Todos los años en el distrito de Chalhuanca, ubicado la provincia de Aymaraes," +
                        " se lleva a cabo la Fiesta Mayor del Señor de Ánimas, importante " +
                        "celebración organizada por los pobladores de Apurímac. El fervor de " +
                        "esta localidad se ve reflejado en las peregrinaciones, donde una gran" +
                        " cantidad de personas salen en procesión a las calles principales para " +
                        "acompañar en su recorrido a la sagrada imagen. ",
                "Del 17 de jul al 5 de ago","Apurimac","Templado","3.826 m.s.n.m.",2);


        FestividadEntity festividad10= new FestividadEntity(10,"Virgen del Carmen de Pisac",
                R.drawable.fest23_200x200,
                "Con una multitud de personas se celebra la festividad de la Virgen del Carmen " +
                        "en Pisac, Cusco. Este homenaje a la virgen es una de las expresiones " +
                        "más memorables de este pueblo, quienes tienen en cuenta el mínimo " +
                        "detalle para realizarlo.",
                "Del 15 al 18 de julio","Cusco","","3.826 m.s.n.m.",2);

        //Fiestas DEPARTAMENTO
        FestividadEntity festividad11= new FestividadEntity(11,"Aniv. de Puno",
                R.drawable.fest3_200x200,
                "Puno, conocida también como “La Ciudad de Plata”, está de fiesta y celebra el" +
                        " 348 aniversario de su creación política. Es por ello que las autoridades" +
                        " de la región han organizado una serie de actividades en las que " +
                        "participaran visitantes y pobladores de toda la región.",
                "Del 1 al 10 de noviembre","Puno","Lluvia","3,827 m.s.n.m.",3);

        FestividadEntity festividad12= new FestividadEntity(12,"Seminario Turístico Puno Ciudad del Lago",
                R.drawable.fest24_200x200,
                "El seminario turístico “Puno Ciudad del Lago”, se realizará el 24 de" +
                        " julio en el Hotel San Agustín Plaza, ubicado en la avenida Sol 594, en " +
                        "Cusco, desde las 16:00 a 18:30 horas.",
                "24 de julio","Puno","","",3);

        FestividadEntity festividad13= new FestividadEntity(13,"Aniversario de Ilo",
                R.drawable.fest25_200x200,
                "Cada 26 de mayo, los pobladores de Ilo celebran con alegría el aniversario de " +
                        "su provincia, preparando las mejores actividades posibles para este " +
                        "día especial. En la semana del aniversario de esta localidad, se ha" +
                        " programado realizar el “Corso de la amistad”, actividad que reúne a un" +
                        " colorido grupo de personas que presentarán lo más resaltante de la" +
                        " cultura de Ilo.",
                "26 de mayo","Moquegua","Templado","",3);

        FestividadEntity festividad14= new FestividadEntity(14,"Aniversario de la provincia de Huancayo",
                R.drawable.fest26_200x200,
                "La provincia de Huancayo está de fiesta al celebrar sus 152° aniversario de" +
                        " Creación Política como provincia. Para ello, las autoridades " +
                        "locales, regionales y nacionales han organizado una serie de actividades" +
                        " para festejar el aniversario de la ciudad centro más importante del Perú.",
                "16 de noviembre","Junin","Frío y lluvioso","3.249 m.s.n.m.",3);

        FestividadEntity festividad15= new FestividadEntity(15,"Aniversario de la Provincia de Puerto Inca",
                R.drawable.fest27_200x200,
                "La provincia de Puerto Inca, ubicada en Huánuco, está de fiesta y celebra " +
                        "su 32° aniversario de creación política, por tal motivo se desarrollarán " +
                        "diversas actividades, entre las que destacan desfiles cívicos, " +
                        "competencias deportivas, almuerzos y una peculiar fiesta popular " +
                        "en los ambientes del Palacio Municipal.",
                "19 de noviembre","Huánuco","Templado","1.894 m.s.n.m.",3);

        //Fiestas MESES
        FestividadEntity festividad16= new FestividadEntity(16,"Aniversario de la fundación de Huancavelica",
                R.drawable.fest_28_200x200,
                "Está celebración contará con una feria gastronómica y concurso de canto y baile el" +
                        " 31 de julio. Al día siguiente se llevará a cabo a una mini maratón, y el" +
                        " día principal, 04 de agosto, se realizará la escenificación de la" +
                        " fundación española de Huancavelica (con más de 480 actores).",
                "4 de agosto","Huancavelica","Templado","",4);

        FestividadEntity festividad17= new FestividadEntity(17,"Fiesta de San Juan Bautista",
                R.drawable.fest29_200x200,
                "Celebración en honor a San Juan Bautista, manifestaciones religiosas" +
                        " presentaciones folklóricas, y presentación de platos típicos.",
                "24 de junio","Lima","Templado","",4);

        FestividadEntity festividad18= new FestividadEntity(18,"Fiesta Patronal del Señor de Chacos",
                R.drawable.fest30_200x200,
                "Peregrinación de fieles y devotos, feria Artesanal y gastronómica, presentación " +
                        "de música y danza y quema de castillos y fuegos artificiales.",
                "Del 1 al 5 de mayo","Huánuco","Templado","94 m.s.n.m.",4);

        FestividadEntity festividad19= new FestividadEntity(19,"Festival del Choclo y la Chirimoya",
                R.drawable.fest31_200x200,
                "En el marco del aniversario de creación política de la provincia de Huari," +
                        " sus pobladores los invitan a participar de las actividades programadas " +
                        "para este año. También se festeja el “Festival del Choclo, Chirimoya y la" +
                        " palta\", donde se expondrán los mejores productos de cosechas de la" +
                        " capital ecológica del Perú, así mismo se mostrará la diversidad " +
                        "culinaria huarina, presentadas por los mejores chef de la zona de los conchucos.",
                "Del 18 al 19 de mayo","Ancash","Templado","94 m.s.n.m.",4);

        FestividadEntity festividad20= new FestividadEntity(20,"Aniversario de la provincia de Chanchamayo",
                R.drawable.fest32_200x200,
                "Para esta festividad se tiene programado fascinantes actividades donde se podrán" +
                        " divertir con amigos o familiares. Campeonatos de ajedrez, ferias" +
                        " culturales y campeonatos deportivos de motocros, skate, futbol," +
                        " entre otros, serán la principal novedad en esta celebración. También" +
                        " se elegirá a la Reina Nativo Tsinane. Esta festividad será un júbilo," +
                        " donde podrán degustar de platillos típicos de la ciudad y comprar" +
                        " hermosas piezas artesanales.",
                "24 de septiembre","Junin","Templado","94 m.s.n.m.",4);

        //Fiestas GASTRONOMICA
        FestividadEntity festividad21= new FestividadEntity(21,"El Chaufa más grande",
                R.drawable.fest13_200x200,"“El Chaufa Más Grande” será presentado este jueves 24 " +
                "de noviembre en la Alameda Chabuca Granda (altura cda. 1 del Jr. Camaná) del " +
                "Centro Histórico de Lima, en la actividad organizada por la Comuna Metropolitana, " +
                "con el apoyo de los principales restaurantes del Barrio Chino, del Centro Histórico, AHORA Huaral, y Cenfotur.",
                "24 de noviembre","Lima","Árido y Semicálido","3 m.s.n.m.",5);

        FestividadEntity festividad22 = new FestividadEntity(22,"Festival del Camarón",
                R.drawable.fest14_200x200,"Para los amantes del camarón, en la provincia Castilla de" +
                " la región Arequipa, todos los años realizan el festival de este exquisito marisco." +
                " Además, se realizan catas de diversos piscos y vinos tradicionales desde la época colonial." +
                "Todos los asistentes disfrutarán del concurso de platos típicos a base de camarón " +
                "como: chupe de camarones, tortilla y chicharrón de camarón.",
                "Del 25 de nov al 2 de dic","Arequipa","Semiárido y templado","9 m.s.n.m.",5);

        FestividadEntity festividad23= new FestividadEntity(23,"Feria salchicha huachana",
                R.drawable.fest15_200x200,"Huacho está de fiesta y celebrará su aniversario 142 como" +
                " ciudad capital de la provincia de Huaura, además de la quinta Feria de la " +
                "salchicha huachana. El evento estará lleno de sorpresas y exhibiciones de platos " +
                "típicos innovadores como: ceviche de trucha, tacu tacu con salchicha, pizza de " +
                "salchicha, sopa huachana y ceviche de pato.",
                "Del 12 al 13 de noviembre","Lima","Árido y semicálido","3 m.s.n.m.",5);

        FestividadEntity festividad24= new FestividadEntity(24,"I Feria Internacional de gastronomía Sabe a Pimentel",
                R.drawable.fest16_200x200,"En el marco del aniversario de la creación política del" +
                " distrito de Pimentel en Chiclayo, se realizará la I Feria Internacional de " +
                "Gastronomía “Sabe a Pimentel”, la cual busca posicionar a la región como destino" +
                " culinario del Perú, además de fomentar la identidad cultural.",
                "Del 28 al 30 de octubre","Lambayeque","Templado.","4 m.s.n.m.",5);

        FestividadEntity festividad25= new FestividadEntity(25,"Festival Regional del Plátano",
                R.drawable.fest17_200x200,"La Municipalidad Provincial de Padre Abad, alista la" +
                " presentación del VI Festival del Platano, promoviendo el encuentro de los " +
                "Productores en una Rueda de Negocios, con plenarias, charlas magistrales, escuela" +
                " de campo la presentación del Tacacho más Grande y el establecimiento de la Ruta" +
                " turística del Platano, con la participación de las autoridades provinciales, y" +
                " representantes de las instituciones públicas y privadas.",
                "Del 4 al 5 de septiembre","Ucayali","","",5);

        //Fiestas FAVORITOS
        /*FestividadEntity festividad26= new FestividadEntity(26,"148° Aniversario de Creación Política y 55° Semana Turística de Chincha",
                R.drawable.fest11_200x200,
                "¡La cuna del folclore afroperuano está de fiesta! La provincia de Chincha cumple 148° años de su creación política, en el marco de la 55° Semana turística de la provincia, donde se ofrecerán una serie de actividades que  reunirán tanto a pobladores como a turistas.",
                "Del 17 al 24 de octubre","Ica","Templado","94 m.s.n.m.",6);*/

        festividad.add(festividad1);
        festividad.add(festividad2);
        festividad.add(festividad3);
        festividad.add(festividad4);
        festividad.add(festividad5);
        festividad.add(festividad6);
        festividad.add(festividad7);
        festividad.add(festividad8);
        festividad.add(festividad9);
        festividad.add(festividad10);
        festividad.add(festividad11);
        festividad.add(festividad12);
        festividad.add(festividad13);
        festividad.add(festividad14);
        festividad.add(festividad15);
        festividad.add(festividad16);
        festividad.add(festividad17);
        festividad.add(festividad18);
        festividad.add(festividad19);
        festividad.add(festividad20);
        festividad.add(festividad21);
        festividad.add(festividad22);
        festividad.add(festividad23);
        festividad.add(festividad24);
        festividad.add(festividad25);
        //festividad.add(festividad26);

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
