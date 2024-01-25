package com.workintech.carCompany;

public class CarSkeleton {
    private String name;
    private String description;

    public void startEngine(){
        System.out.println("Start engine.");
    }
    public void drive(){
        this.runEngine();
        System.out.println("Drive.");
    }
    protected void runEngine(){
        System.out.println("Run engine.");
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
