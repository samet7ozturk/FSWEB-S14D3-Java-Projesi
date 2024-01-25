package com.workintech.pacificCarCompany;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "com.workintech.pacificCarCompany.Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String startEngine(){
        return name+"'s engine is starting. Class: "+getClass().getSimpleName() ;
    }
    public String accelerate(){
        return name+" is accelerating. Class: "+getClass().getSimpleName();
    }
    public String brake(){
        return name+" is braking. Class: "+getClass().getSimpleName();
    }
}
