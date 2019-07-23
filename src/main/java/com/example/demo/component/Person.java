package com.example.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.example.demo.service.TaxiCaller;

@Component
public class Person {


    @Autowired
    private TaxiCaller taxiCaller;
    @Value("${user.properties.person.name}")
    private String name;
    @Value("${user.properties.person.phoneNumber}")
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void goTaxi() {
        taxiCaller.call(name,phoneNumber);

    }
}
