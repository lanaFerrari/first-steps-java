package com.example.greeting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String createdBy;
    private String greeting;
    private String originCountry;

    public Greeting(String createdBy, String greeting, String originCountry) {
        this.createdBy = createdBy;
        this.greeting = greeting;
        this.originCountry = originCountry;
    }

    public Greeting() {

    }

    public int getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id: " + id +
                " created: " + createdBy +
                " greeting: " + greeting +
                " originCountry " + originCountry +
                " }";
    }
}