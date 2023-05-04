package com.ab.adapter.service;

public class AdapterDpTest {
    public static void main(String[] args) {
        // create service class object
        AccuWeatherService accuWeatherService = new AccuWeatherServiceImpl();

        // invoke method
        System.out.println(accuWeatherService.showTemprature("Mumbai"));
        System.out.println(accuWeatherService.showTemprature("Delhi"));
    }
}
