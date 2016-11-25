package com.aromero.appproject.model;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class CategoryEntity {

    private int id;
    private String name;
    private int photo;

    public CategoryEntity(int id, String name, int photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }

    public CategoryEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
