package com.github.flavioportugal20.dto;

import org.springframework.data.geo.Point;

import java.io.Serializable;

public class PointDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double latitude;
    private Double longitude;

    public PointDTO(){
    }

    public PointDTO(Point point){
        this.latitude = point.getX();
        this.longitude = point.getY();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
