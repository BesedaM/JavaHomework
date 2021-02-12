package com.epam.testproject.airport.model.logic;

import com.epam.testproject.airport.model.TestData;
import com.epam.testproject.airport.model.entity.Airport;
import com.epam.testproject.airport.model.entity.plane.Plane;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AirportSorterTest {

    @Test(dataProvider = "airport", dataProviderClass = TestData.class)
    public void testSortPlanesByMaxLoadCapacity01(Airport<Plane> airport) {
        AirportSorter.sortPlanesByMaxLoadCapacity(airport);
        List<Plane> planesSorted = airport.getPlanes();
        Assert.assertTrue(planesSorted.get(0).getMaximumLoadCapacity()
                <= planesSorted.get(1).getMaximumLoadCapacity());
    }

    @Test(dataProvider = "airport", dataProviderClass = TestData.class)
    public void testSortPlanesByMaxLoadCapacity02(Airport<Plane> airport) {
        AirportSorter.sortPlanesByMaxLoadCapacity(airport);
        List<Plane> planesSorted = airport.getPlanes();
        Assert.assertTrue(planesSorted.get(0).getMaximumLoadCapacity()
                <= planesSorted.get(planesSorted.size() - 1).getMaximumLoadCapacity());
    }
}