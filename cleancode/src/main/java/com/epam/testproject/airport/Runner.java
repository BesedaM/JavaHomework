package com.epam.testproject.airport;

import com.epam.testproject.airport.model.entity.Airport;
import com.epam.testproject.airport.model.entity.plane.MilitaryPlane;
import com.epam.testproject.airport.model.entity.plane.PassengerPlane;
import com.epam.testproject.airport.model.entity.plane.Plane;
import com.epam.testproject.airport.model.logic.PlanesFinder;
import com.epam.testproject.airport.model.logic.AirportSorter;
import com.epam.testproject.airport.model.util.PlanesCreator;


public class Runner {

    public static void main(String[] args) {
        Airport<Plane> airport = new Airport<>(PlanesCreator.createListOfPlanes());

        Airport<MilitaryPlane> militaryAirport = new Airport<>(airport.getMilitaryPlanes());
        Airport<PassengerPlane> passengerAirport = new Airport<>(airport.getPassengerPlanes());

        AirportSorter.sortPlanesByMaxDistance(militaryAirport);
        System.out.println("Military planes sorted by maximum distance: " + militaryAirport.toString());
        AirportSorter.sortPlanesByMaxSpeed(passengerAirport);
        System.out.println("Passenger planes sorted by maximum speed: " + passengerAirport.toString());

        System.out.println("Plane with maximum passenger capacity: "
                + PlanesFinder.findPassengerPlaneWithMaximumPassengersCapacity(passengerAirport));
    }
}
