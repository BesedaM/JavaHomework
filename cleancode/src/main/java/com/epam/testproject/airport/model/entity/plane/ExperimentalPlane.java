package com.epam.testproject.airport.model.entity.plane;

import java.util.Objects;

public class ExperimentalPlane extends Plane {

    private Type type;
    private Classification classification;

    public enum Type {
        LIFTING_BODY, HYPERSONIC, HIGH_ALTITUDE, VTOL
    }

    public enum Classification {
        UNCLASSIFIED, CONFIDENTIAL, SECRET, TOP_SECRET
    }

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             Type type, Classification classification) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classification = classification;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExperimentalPlane)) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return type == that.type &&
                classification == that.classification;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classification);
    }

    @Override
    public String toString() {
        return super.toString() + ", type - " + type.name() + ", classification - " + classification;
    }
}
