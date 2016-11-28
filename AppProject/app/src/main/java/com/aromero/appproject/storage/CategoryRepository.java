package com.aromero.appproject.storage;

import com.aromero.appproject.R;
import com.aromero.appproject.model.CategoryEntity;
import com.aromero.appproject.model.FestividadEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class CategoryRepository {

    private List<CategoryEntity> categories;

    public CategoryRepository() {
        categories = new ArrayList<CategoryEntity>();
    }

    public void mock() {


        CategoryEntity categor1 = new CategoryEntity(1,"Civicas",R.drawable.fest11_200x200);
        CategoryEntity categor2 = new CategoryEntity(2,"Religiosas",R.drawable.fest11_200x200);
        CategoryEntity categor3 = new CategoryEntity(3,"Departamento",R.drawable.fest11_200x200);
        CategoryEntity categor4 = new CategoryEntity(4,"Mes",R.drawable.fest11_200x200);
        CategoryEntity categor5 = new CategoryEntity(5,"Gastronomica",R.drawable.fest11_200x200);
        CategoryEntity categor6 = new CategoryEntity(6,"Favorito",R.drawable.fest11_200x200);

        categories.add(categor1);
        categories.add(categor2);
        categories.add(categor3);
        categories.add(categor4);
        categories.add(categor5);
        categories.add(categor6);

    }
}
