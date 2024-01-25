package com.workintech.carCompany;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batterySize=" + batterySize +
                '}';
    }
}
