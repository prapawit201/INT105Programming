package safetiwoopSafe;

public class Plane extends Vehicle {

    private String model;
    private String airway;
    private double kerosene;

    public Plane(int vehicleid, String model, String airway, double kerosene) {
        super(vehicleid);
        this.model = model;
        this.airway = airway;
        this.kerosene = kerosene;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAirway() {
        return airway;
    }

    public void setAirway(String airway) {
        this.airway = airway;
    }

    public double getKerosene() {
        return kerosene;
    }

    public void setKerosene(double kerosene) {
        this.kerosene = kerosene;
    }

    @Override
    public String toString() {
        return "plane{" + "model=" + model + ", airway=" + airway + ", kerosene=" + kerosene + '}';
    }

    @Override
    public boolean checkConsumeEnergy(double distance) {
        double distancePlane = this.kerosene * 10;
        if (distance <= distancePlane) {
            return true;
        } else {
            return false;
        }
    }

}
