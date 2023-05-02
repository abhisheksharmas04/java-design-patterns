package com.ab.strategy.dp.factory;

import com.ab.strategy.dp.component.DieselEngine;
import com.ab.strategy.dp.component.IEngine;
import com.ab.strategy.dp.component.PetrolEngine;
import com.ab.strategy.dp.component.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicleInstance(String engineType) {
        IEngine engine = null;
        if (engineType.equalsIgnoreCase("diesel")) {
            engine = new DieselEngine();
        } else if (engineType.equalsIgnoreCase("petrol")) {
            engine = new PetrolEngine();
        } else {
            throw new IllegalArgumentException("Invalid engine type");
        }

        // create target class object:
        Vehicle vehicle = new Vehicle();

        // assign dependent class object to target class object
        vehicle.setEngine(engine);

        return vehicle;
    }
}
