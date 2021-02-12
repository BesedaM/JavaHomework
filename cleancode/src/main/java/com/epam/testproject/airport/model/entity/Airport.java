package com.epam.testproject.airport.model.entity;

import com.epam.testproject.airport.model.entity.plane.ExperimentalPlane;
import com.epam.testproject.airport.model.entity.plane.MilitaryPlane;
import com.epam.testproject.airport.model.entity.plane.PassengerPlane;
import com.epam.testproject.airport.model.entity.plane.Plane;

import java.util.*;

/**
 * @author Vitali Shulha
 * @version 1.1
 * @since 4-Jan-2019
 */
public class Airport<T extends Plane> {

    private List<T> planes;

    public Airport(List<T> planes) {
        this.planes = planes;
    }

    public List<T> getPlanes() {
        return this.planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }


    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanesOfSpecialType(MilitaryPlane.Type type) {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane &&
                    ((MilitaryPlane) plane).getType().equals(type)) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }


    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }


    @Override
    public String toString() {
        return "Airport with planes: " + System.lineSeparator()
                + planes.toString();
    }
}
