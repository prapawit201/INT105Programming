package Shape;

public class rectangle extends colorshape {

    private double width;
    private double high;

    public rectangle( double width, double high) {
        this("Black",width,high);
    }

    public rectangle(String color, double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }

    public double getWidth() {
        return width;
   
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        double area = high * width;

        return area;
    }

    @Override
    public double getperimeter() {
        double perimeter;
        perimeter = (high + width) * 2;
        return perimeter;
    }
    public boolean equal(Object obj) {//เขียนหาค่าboolean เอง
        boolean result = false ;//ที่เป็น Objeact เพราะ เราจะรับค่าอะไรมาใส่ก็ได้
        if(obj!=null && obj instanceof rectangle){
            rectangle temp = (rectangle)obj ; 
            if(this.high==temp.high && this.width == temp.width){
                result = true;
            }
        }
        return result ;
    }
    @Override
    public String toString() {
        return super.toString()+ "rectangle{" + "width=" + width + ", high=" + high + '}';
    }


    

}
