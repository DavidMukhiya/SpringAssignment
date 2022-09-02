package org.genspark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("#{new java.lang.String('Kathmandu')}")
    private String city;

    @Value("#{new java.lang.String('CA')}")
    private String state;

    @Value("#{new java.lang.String('US')}")
    private String country;

    @Value("#{new java.lang.String('91775')}")
    private String zipcode;


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
