package com.wabu.sandbox.restclient.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SensorValue {

    private final String datePattern = "yyyy-mm-dd HH:mm:ss";
    private final SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);

    @JsonFormat(pattern = datePattern)
    private Date date;
    private Float value;

    public SensorValue() {
    }

    public SensorValue(Date date, Float value) {
        this.date = date;
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nSensorValue{" +
                "date = " + dateFormat.format(date) +
                ", value = " + value +
                '}';
    }
}
