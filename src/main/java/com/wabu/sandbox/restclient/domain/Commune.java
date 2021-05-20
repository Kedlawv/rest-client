package com.wabu.sandbox.restclient.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Commune {

    @Id
    @GeneratedValue
    private int id;
    private String communeName;
    private String districtName;
    private String provinceName;

    public Commune() {
    }

    public Commune(String communeName, String districtName, String provinceName) {
        this.communeName = communeName;
        this.districtName = districtName;
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommuneName() {
        return communeName;
    }

    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "Commune{" +
                "id=" + id +
                ", communeName='" + communeName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commune commune = (Commune) o;
        return Objects.equals(communeName, commune.communeName) &&
                Objects.equals(districtName, commune.districtName) &&
                Objects.equals(provinceName, commune.provinceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communeName, districtName, provinceName);
    }
}
