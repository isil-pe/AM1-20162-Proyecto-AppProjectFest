package com.aromero.appproject.model;

import java.io.Serializable;

/**
 * Created by aromero on 21/11/2016.
 */
public class FestividadEntity implements Serializable {

    private int id;
    private String nombre;
    private int photo;
    private String descripcion;
    private String fecha;
    private String lugar;
    private String clima;
    private String altitud;

    public FestividadEntity(int id, String nombre, int photo, String descripcion, String fecha, String lugar, String clima, String altitud) {
        this.id = id;
        this.nombre = nombre;
        this.photo = photo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.clima = clima;
        this.altitud = altitud;
    }

    public FestividadEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }
}
