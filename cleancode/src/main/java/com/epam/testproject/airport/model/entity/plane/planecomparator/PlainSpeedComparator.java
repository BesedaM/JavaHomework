package com.epam.testproject.airport.model.entity.plane.planecomparator;

import com.epam.testproject.airport.model.entity.plane.Plane;

import java.util.Comparator;

public class PlainSpeedComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane plane01, Plane plane02) {
        return plane01.getMaximumSpeed() - plane02.getMaximumSpeed();
    }
}
