package com.example.demo.repository;

import com.example.demo.model.Taxi;
import com.example.demo.service.TaxiCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Repository
public class TaxiRepository {
    @Autowired
    List<Taxi> taxiList;
    @Autowired
    TaxiCaller taxiCaller;

    public  Taxi getFreeTaxi() {
       DayOfWeek dayOfWeek= LocalDate.now().getDayOfWeek();
       for(Taxi taxi:taxiList){
           if (!taxi.getRestDay().equals(dayOfWeek)){
               return taxi;
           }

       }
       return null;
    }
}
