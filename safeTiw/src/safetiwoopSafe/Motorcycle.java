
package safetiwoopSafe;


public class Motorcycle extends Vehicle {
    private String model;
    private String mannufacture;
    private double gasoline;

    public Motorcycle( int vehicleid,String model, String mannufacture, double gasoline) {
        super(vehicleid);
        this.model = model;
        this.mannufacture = mannufacture;
        this.gasoline = gasoline;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMannufacture() {
        return mannufacture;
    }

    public void setMannufacture(String mannufacture) {
        this.mannufacture = mannufacture;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public String toString() {
        return "motorcycle{" + "model=" + model + ", mannufacture=" + mannufacture + ", gasoline=" + gasoline + '}';
    }

    @Override
    public boolean checkConsumeEnergy(double distance) {
             double distancePlane = this.gasoline/0.12;
            if(distance <= distancePlane){
            return true;
        }
            else{
                return false;
            }

    
    
    
    
}
}
