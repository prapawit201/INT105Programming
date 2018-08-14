package OopProject.car;

import java.util.Scanner;

public class car {

    private String model;
    private String brand;
    private double fuel;
    private double kml;
    private double distance ;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double addfuel(double fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
        } else {
            System.out.println("Lost Your fuel!!!");
        }
        return this.fuel;
    }

    public double fuel(double distance,double kml) {
        this.fuel = (distance / kml);

        return this.fuel;
    }

    public double getKml() {
        return kml;
    }

    public void setKml(double kml) {
        this.kml = kml;
    }

  

}
