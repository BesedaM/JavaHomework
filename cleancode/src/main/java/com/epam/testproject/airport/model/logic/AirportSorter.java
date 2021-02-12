package com.epam.testproject.airport.model.logic;

import com.epam.testproject.airport.model.entity.Airport;
import com.epam.testproject.airport.model.entity.plane.Plane;
import com.epam.testproject.airport.model.entity.plane.planecomparator.PlaneDistanceComparator;
import com.epam.testproject.airport.model.entity.plane.planecomparator.PlainLoadCapacityComparator;
import com.epam.testproject.airport.model.entity.plane.planecomparator.PlainSpeedComparator;

import java.util.Collections;


/**
 * Sorts planes in airport in the specified order
 */
public class AirportSorter {

    public static void sortPlanesByMaxDistance(Airport<? extends Plane> airport) {
        Collections.sort(airport.getPlanes(), new PlaneDistanceComparator());
    }

    public static void sortPlanesByMaxSpeed(Airport<? extends Plane> airport) {
        Collections.sort(airport.getPlanes(), new PlainSpeedComparator());
    }

    public static void sortPlanesByMaxLoadCapacity(Airport<? extends Plane> airport) {
        Collections.sort(airport.getPlanes(), new PlainLoadCapacityComparator());
    }

}
