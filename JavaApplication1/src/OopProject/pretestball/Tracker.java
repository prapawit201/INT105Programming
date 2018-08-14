package OopProject.pretestball;


public class Tracker {
    private double x ;
    private double y ;
    private char type ;
    
    public double getdistance(double x2,double y2){
        return Math.sqrt(Math.pow(x2-this.x, 2)+(Math.pow(y2-this.y, 2)));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Tracker(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Tracker() {
    }
    
    @Override
    public String toString() {
        return "Tracker{" + "x=" + x + ", y=" + y + ", type=" + type + '}';
    }
    
    
    
    
}

