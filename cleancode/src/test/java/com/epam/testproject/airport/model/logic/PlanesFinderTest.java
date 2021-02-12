package com.epam.testproject.airport.model.logic;

import com.epam.testproject.airport.model.entity.Airport;
import com.epam.testproject.airport.model.entity.plane.PassengerPlane;
import com.epam.testproject.airport.model.entity.plane.Plane;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.epam.testproject.airport.model.TestData;

public class PlanesFinderTest {

    private static PassengerPlane planeWithMaxPassengerCapacity;


    @BeforeClass
    public void createTestData() {
        planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100,
                70500, 242);
    }


    @Test(dataProvider = "airport", dataProviderClass = TestData.class)
    public void testGetPassengerPlaneWithMaxCapacity(Airport<Plane> airport) {
        PassengerPlane planeWithMaxPassengersCapacity = PlanesFinder.findPassengerPlaneWithMaximumPassengersCapacity(airport);
        Assert.assertEquals(planeWithMaxPassengersCapacity, planeWithMaxPassengerCapacity);
    }

}