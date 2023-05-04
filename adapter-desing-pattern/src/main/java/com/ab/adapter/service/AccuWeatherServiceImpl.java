package com.ab.adapter.service;

import java.text.DecimalFormat;

import com.ab.adapter.WeatherReportComponentAdapter;

public class AccuWeatherServiceImpl implements AccuWeatherService {

    @Override
    public String showTemprature(String cityName) {
        // use adapter
        WeatherReportComponentAdapter adapter = new WeatherReportComponentAdapter();
        double temprature = adapter.fetchTemprature(cityName);

        DecimalFormat df = new DecimalFormat("0.00");

        return "temprature of city " + cityName + "is " + df.format(temprature) + " celsius degree.";
    }

}
