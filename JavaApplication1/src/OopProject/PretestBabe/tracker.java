package OopProject.PretestBabe;

public class tracker {

    private double x1;
    private double y1;
    private char type;

    @Override
    public String toString() {
        return "tracker{" + "x1=" + x1 + ", y1=" + y1 + ", type=" + type + '}';
    }
    
    public double getdis(double x2,double y2){
        return Math.sqrt(Math.pow(x2-this.x1,2)+(Math.pow(y2-this.y1, 2)));
    }

    public tracker(double x1, double y1, char type) {
        this.x1 = x1;
        this.y1 = y1;
        this.type = type;
    }

  

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

}
