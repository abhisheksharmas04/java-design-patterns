package com.ab.strategy.dp.test;

import com.ab.strategy.dp.component.Vehicle;
import com.ab.strategy.dp.factory.VehicleFactory;

public class StrategyDPTest {
    public static void main(String[] args) {
        // use factory
        Vehicle vehicle = VehicleFactory.getVehicleInstance("diesel");
        vehicle.drive("Ajmer", "Jaipur");
    }
}
