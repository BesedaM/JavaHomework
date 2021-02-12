package com.epam.testproject.airport.model.entity;

import com.epam.testproject.airport.model.TestData;
import com.epam.testproject.airport.model.entity.plane.MilitaryPlane;
import com.epam.testproject.airport.model.entity.plane.Plane;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class AirportTest {

    @Test(dataProvider = "airport", dataProviderClass = TestData.class)
    public void testGetTransportMilitaryPlanes01(Airport<Plane> airport) {
        List<MilitaryPlane> transportMilitaryPlanes = airport.getMilitaryPlanesOfSpecialType(MilitaryPlane.Type.TRANSPORT);
        Assert.assertEquals(transportMilitaryPlanes.get(0).getType(), MilitaryPlane.Type.TRANSPORT);
    }

    @Test(dataProvider = "airport", dataProviderClass = TestData.class)
    public void testGetTransportMilitaryPlanes02(Airport<Plane> airport) {
        List<MilitaryPlane> transportMilitaryPlanes = airport.getMilitaryPlanesOfSpecialType(MilitaryPlane.Type.TRANSPORT);
        Assert.assertEquals(transportMilitaryPlanes.get(transportMilitaryPlanes.size() - 1).getType(),
                MilitaryPlane.Type.TRANSPORT);
    }


}