package Shape;

public final class circle extends colorshape {

    private double radius;

    public circle(double radius) {
        this("White", radius);
    }

    public circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        double area = Math.PI * (radius * radius);

        return area;
    }
    
    
    @Override
    public double getperimeter() {
        double perimeter = 2 * Math.PI * (radius);

        return perimeter;
    }

    public boolean equal(Object obj) {//เขียนหาค่าboolean เอง
        boolean result = false ;//ที่เป็น Objeact เพราะ เราจะรับค่าอะไรมาใส่ก็ได้
        if(obj!=null && obj instanceof circle){
            circle temp = (circle)obj ; 
            if(this.radius==temp.radius){
                result = true;
            }
        }
        return result ;
    }
    @Override
    public String toString() {
        return super.toString()+"circle{" + "radius=" + radius + '}';
    }



    

}
