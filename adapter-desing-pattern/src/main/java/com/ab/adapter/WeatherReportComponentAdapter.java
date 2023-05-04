package com.ab.adapter;

import com.ab.adapter.external.WeatherReportComponent;
import com.ab.adapter.external.WeatherReportComponentImpl;

public class WeatherReportComponentAdapter {
    public double fetchTemprature(String cityName){
        int cityCode = 0;
        // Get city code based on the city name (we can take by DB or Web component)
        if(cityName.equalsIgnoreCase("Hydrabad")){
            cityCode=111;
        } else if(cityName.equalsIgnoreCase("Delhi")){
            cityCode=121;
        }
        else if(cityName.equalsIgnoreCase("Mumbai")){
            cityCode=131;
        }
        else if(cityName.equalsIgnoreCase("Chennai")){
            cityCode=141;
        }else{
            throw new IllegalArgumentException("Invaid city name");
        }
        // Get External compontent reference
        WeatherReportComponent externalComponent = WeatherReportComponentImpl.getInstance();

        // Invoke business method on external component reference
        double temprature = externalComponent.getTemparatue(cityCode);
        //externalComponent.getTemparatue(cityCode) gives temprature in Fahrenheit

        // convert fahrenheit degrees to celsius degree
        temprature = ((temprature-32) * 5)/9;       
        return temprature;
    }
}
