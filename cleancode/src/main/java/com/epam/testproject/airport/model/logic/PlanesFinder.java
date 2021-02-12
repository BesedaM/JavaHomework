package com.epam.testproject.airport.model.logic;

import com.epam.testproject.airport.model.entity.Airport;
import com.epam.testproject.airport.model.entity.plane.PassengerPlane;
import com.epam.testproject.airport.model.entity.plane.Plane;

import java.util.List;

/**
 * Finds planes in the airport by the specified field
 */
public class PlanesFinder {

    public static PassengerPlane findPassengerPlaneWithMaximumPassengersCapacity(Airport<? extends Plane> airport) {
        List<PassengerPlane> passengerPlanes = airport.getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = null;
        if (passengerPlanes.size() > 0) {
            planeWithMaxCapacity = passengerPlanes.get(0);
            for (int i = 1; i < passengerPlanes.size(); i++) {
                if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                    planeWithMaxCapacity = passengerPlanes.get(i);
                }
            }
        }
        return planeWithMaxCapacity;
    }
}
