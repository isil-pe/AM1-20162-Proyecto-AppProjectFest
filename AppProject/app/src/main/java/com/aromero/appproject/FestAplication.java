package com.aromero.appproject;

import android.app.Application;

import com.aromero.appproject.model.FestividadEntity;
import com.aromero.appproject.storage.CategoryRepository;
import com.aromero.appproject.storage.FestByCategoryRepository;
import com.aromero.appproject.storage.FestRepository;

/**
 * Created by aromero on 21/11/2016.
 */
public class FestAplication extends Application {

    private FestRepository festRepository;
    private FestByCategoryRepository festByCategoryRepository;
    int cat = 0;
    //private CategoryRepository categoryRepository;



    @Override
    public void onCreate() {
        super.onCreate();

        festRepository= new FestRepository();
        festRepository.mock();

        festByCategoryRepository = new FestByCategoryRepository(festRepository);
        festByCategoryRepository.getFestByCategory(cat);





    }


    public FestRepository getPlaceRepository() {
        return festRepository;
    }

    public FestByCategoryRepository getPlace2Repository() {
        return festByCategoryRepository;
    }
}
