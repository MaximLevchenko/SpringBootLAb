package com.example.demo.configuration;

import com.example.demo.model.Taxi;
import org.assertj.core.util.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.List;

@Configuration
public class TaxiConfiguration {

    @Bean
    List<Taxi>taxiList(){
        Taxi t1=new Taxi("Honda","1245","Artur",DayOfWeek.SATURDAY);
        Taxi t2=new Taxi("Lanos","1234","Max",DayOfWeek.FRIDAY);
        Taxi t3=new Taxi("Mazda","1347","Alex",DayOfWeek.MONDAY);
        Taxi t4=new Taxi("Toyota","1568","Andrew",DayOfWeek.TUESDAY);
        return Lists.newArrayList(t1,t2,t3);

    }


}
