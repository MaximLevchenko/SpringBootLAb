package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.DayOfWeek;

public class Taxi {

    String car;
    String carNumber;
    String driverName;
    DayOfWeek restDay;

    @Autowired
    public Taxi(String car, String carNumber, String driverName, DayOfWeek restDay) {
        this.car = car;
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.restDay = restDay;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public DayOfWeek getRestDay() {
        return restDay;
    }

    public void setRestDay(DayOfWeek restDay) {
        this.restDay = restDay;
    }
}
