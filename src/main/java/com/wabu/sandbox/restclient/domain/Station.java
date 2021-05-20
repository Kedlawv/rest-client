package com.wabu.sandbox.restclient.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Station {

    @Id
    private int id;
    private String stationName;
    private float gegrLat;
    private float gegrLon;
    @ManyToOne
    private City city;
    private String addressStreet;

    public Station() {
    }

    public Station(int id, String stationName, float gegrLat, float gegrLon, City city, String addressStreet) {
        this.id = id;
        this.stationName = stationName;
        this.gegrLat = gegrLat;
        this.gegrLon = gegrLon;
        this.city = city;
        this.addressStreet = addressStreet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public float getGegrLat() {
        return gegrLat;
    }

    public void setGegrLat(float gegrLat) {
        this.gegrLat = gegrLat;
    }

    public float getGegrLon() {
        return gegrLon;
    }

    public void setGegrLon(float gegrLon) {
        this.gegrLon = gegrLon;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    @Override
    public String toString() {
        return "\nStation{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", gegrLat=" + gegrLat +
                ", gegrLon=" + gegrLon +
                ", city=" + city +
                ", addressStreet='" + addressStreet + '\'' +
                '}';
    }
}
