package com.workintech.carCompany;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    @Override
    public void startEngine() {
        System.out.println("Gas Powered Car Engine.");
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                '}';
    }
}
