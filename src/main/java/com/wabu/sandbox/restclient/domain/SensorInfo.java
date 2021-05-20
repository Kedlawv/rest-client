package com.wabu.sandbox.restclient.domain;

import java.util.Map;

public class SensorInfo {

    private int id;
    private int stationId;
    private Map<String,String> param;

    public SensorInfo() {
    }

    public SensorInfo(int id, int stationId, Map<String, String> param) {
        this.id = id;
        this.stationId = stationId;
        this.param = param;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "\nSensorInfo{" +
                "id=" + id +
                ", stationId=" + stationId +
                ", param=" + param +
                '}';
    }
}
