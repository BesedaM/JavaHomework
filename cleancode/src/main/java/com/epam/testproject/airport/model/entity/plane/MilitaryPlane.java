package com.epam.testproject.airport.model.entity.plane;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private Type type;

    public enum Type {
        FIGHTER, BOMBER, TRANSPORT
    }

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                         Type type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        return type == ((MilitaryPlane) o).type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return super.toString() + ", type - " + type.name();
    }
}
