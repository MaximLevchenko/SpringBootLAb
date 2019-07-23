package com.example.demo.service;

import com.example.demo.configuration.TaxiConfiguration;
import com.example.demo.model.Taxi;
import com.example.demo.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiCaller {
    @Autowired
    TaxiRepository taxiRepository;
    @Autowired
    TaxiConfiguration taxiConfiguration;
    @Autowired
    List<Taxi> taxiList;

    public void call(String person, String phoneNumber) {
        Taxi car = taxiRepository.getFreeTaxi();
        System.out.println("Call taxi for" + " " + person + " Phone number of the contact is: " + phoneNumber);
        System.out.println("Car: " + car.toString());
    }

}
