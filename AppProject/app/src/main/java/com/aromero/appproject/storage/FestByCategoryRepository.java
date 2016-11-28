package com.aromero.appproject.storage;

import com.aromero.appproject.model.FestividadEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class FestByCategoryRepository {

    private List<FestividadEntity> festividades;
    private final FestRepository festRepository;

    public FestByCategoryRepository(FestRepository festRepository) {
        this.festRepository = festRepository;
        festividades = new ArrayList<FestividadEntity>();
    }



    public  List<FestividadEntity> getFestByCategory(int category){

        List<FestividadEntity> festividadEntities = new ArrayList<>();
        for (FestividadEntity festividadEntity : festRepository.allFestividades()) {
            if(festividadEntity.getCategoryId()==category){

                festividadEntities.add(festividadEntity);
            }
        }
        return festividadEntities;
    }
}
