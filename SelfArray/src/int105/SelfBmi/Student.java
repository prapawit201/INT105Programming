
package int105.SelfBmi;

public class Student {

    private String name;
    private int weight;
    private double height;

    public Student(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
}
