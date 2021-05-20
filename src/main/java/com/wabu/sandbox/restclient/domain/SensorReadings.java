package com.wabu.sandbox.restclient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SensorReadings {

    @JsonProperty("key")
    private String type;
    @JsonProperty("values")
    private List<SensorValue> readings;

    public SensorReadings() {
    }

    public SensorReadings(String type, List<SensorValue> readings) {
        this.type = type;
        this.readings = readings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SensorValue> getReadings() {
        return readings;
    }

    public void setReadings(List<SensorValue> readings) {
        this.readings = readings;
    }

    @Override
    public String toString() {
        return "\nSensorData{" +
                "type = '" + type + '\'' +
                ", values = " + readings +
                '}';
    }
}
