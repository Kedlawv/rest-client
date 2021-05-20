package com.wabu.sandbox.restclient.domain;

import javax.persistence.*;

@Entity
public class City {

    @Id
    private int id;
    private String name;
    @ManyToOne
    private Commune commune;

    public City() {
    }

    public City(int id, String name, Commune commune) {
        this.id = id;
        this.name = name;
        this.commune = commune;
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

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", commune=" + commune +
                '}';
    }
}
