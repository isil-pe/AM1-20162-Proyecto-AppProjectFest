package com.aromero.appproject;

import android.app.Application;

import com.aromero.appproject.storage.CategoryRepository;
import com.aromero.appproject.storage.FestByCategoryRepository;
import com.aromero.appproject.storage.FestRepository;

/**
 * Created by aromero on 21/11/2016.
 */
public class FestAplication extends Application {

    private FestRepository festRepository;
    //private FestByCategoryRepository festByCategoryRepository;
    //private CategoryRepository categoryRepository;



    @Override
    public void onCreate() {
        super.onCreate();

        festRepository= new FestRepository();
        festRepository.mock();

        //categoryRepository = new CategoryRepository();
        //categoryRepository.mock();

        //festByCategoryRepository = new FestByCategoryRepository();
        //festByCategoryRepository.getFestByCategory();

    }


    public FestRepository getPlaceRepository() {
        return festRepository;
    }

    //public CategoryRepository getPlace2Repository() {
        //return categoryRepository;
    //}
}
