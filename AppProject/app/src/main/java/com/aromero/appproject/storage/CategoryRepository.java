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

        categories.add(categor1);
        categories.add(categor2);

    }
}
