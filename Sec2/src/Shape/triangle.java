package Shape;
//implements บังคับว่าต้องมี เมทอดใน shape

public class triangle extends colorshape {

    private double line1, line2, line3;

    public triangle(String color,double line1, double line2, double line3) {
        super(color);
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public triangle(String color) {
        super(color);
    }





    @Override
    public double getArea() {
       return this.line1 + this.line2 + this.line3;
    }

    @Override
    public double getperimeter() {
        return this.line1 + this.line2 + this.line3;
    }

    public int compareto(shape she02) {
        int result = 0;
        if (this.getArea() < she02.getArea()) {
            result = -1;
        } else if (this.getArea() == she02.getArea()) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    @Override
    public String toString() {
        return "triangle{" + "line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + +'}';
    }
    
}