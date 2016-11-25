package com.aromero.appproject;

import android.app.Application;

import com.aromero.appproject.storage.FestRepository;

/**
 * Created by aromero on 21/11/2016.
 */
public class FestAplication extends Application {

    private FestRepository festRepository;

    @Override
    public void onCreate() {
        super.onCreate();

        festRepository= new FestRepository();
        festRepository.mock();
    }


    public FestRepository getPlaceRepository() {
        return festRepository;
    }
}
