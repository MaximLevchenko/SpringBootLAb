package com.example.demo;

import com.example.demo.component.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    private Person person;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onRun() {
        person.goTaxi();
        System.out.println("System Started");
    }

}
