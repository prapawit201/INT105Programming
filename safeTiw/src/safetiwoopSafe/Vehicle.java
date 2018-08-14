
package safetiwoopSafe;


public abstract class Vehicle {
    private int vehicleid ;
    
    
     public abstract boolean checkConsumeEnergy(double distance);
    
    public Vehicle(int vehicleid) {
        this.vehicleid = vehicleid;
    }
    
    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
    }

    @Override
    public String toString() {
        return "vehicle{" + "vehicleid=" + vehicleid + '}';
    }

    static class motorcycle {

        public motorcycle() {
        }
    }
    
}
