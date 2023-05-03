package com.ab.adapter.external;

// External component which gives given city temparature in FH degree
public class WeatherReportComponentImpl implements WeatherReportComponent {
    private static WeatherReportComponent INTANCE;

    private WeatherReportComponentImpl() {
        // Creating Singletone class
    }

    // static factory method
    public static WeatherReportComponent getInstance() {
        if (INTANCE == null)
            INTANCE = new WeatherReportComponentImpl();

        return INTANCE;
    }

    @Override
    public double getTemparatue(int cityCode) {
        // Get weather report data from database or IOT devices
        double temprature = 0;
        if (cityCode == 100) {
            temprature = Math.random() * 100.0;
        } else if (cityCode == 101) {
            temprature = Math.random() * 110.0;
        } else if (cityCode == 102) {
            temprature = Math.random() * 120;
        } else if (cityCode == 103) {
            temprature = Math.random() * 130;
        } else {
            throw new IllegalArgumentException("Invalid city code");
        }
        return temprature;
    }
}

/*
 * since we are developing external service component class as ordinary java classthat we found no state in that class. so we have taken that external class as single tom java class
 
 * if that class/logics are developed in EJB or web service component then we no need to worry about single object creation. Underyling EJB or framework implementation will take care of that process.
 
 * always make external components/ distributed components is having one interface and one implemenation class, so that we can pass/supply interface to client project/ local project to make to recieve and hold external comp references.
 
 * java Adapter class is not way related to Adapter DP. In java Adapter class is a class that implements interface and provides null methods definitations. so instead of implementing interface we can make our class extending from adapter class and we can override only those methods in which we are intrested in.
 
 * Adapter Desing pattern is all about acting as bridge/mediator having logics for converting inputs and outputs in the process of interacting with external component.
 
 * every local project will take one Adapter classes on one per external component basis   
  
 */