//รวมข้อ4ทั้งหมดไว้เเล้ว
package OOPOLIV.olivPen;

import java.text.DecimalFormat;

public class pen {
    private long id;
    private String model;
    private String brand;
    private double price;
    private static int numberofpen;//ข้อ4.1
    private static String allpen = "";

    public static int getNumberofpen() {
        return numberofpen;
    }

    public static void setNumberofpen(int numberofpen) {
        pen.numberofpen = numberofpen;
    }

    public static String getAllpen() {
        return allpen;
    }

    public static void setAllpen(String allpen) {
        pen.allpen = allpen;
    }
//รวมข้อ4ทั้งหมดไว้เเล้ว
    public static int Countpen() {
        return numberofpen;
    }

    public static void setCountpen(int countpen) {
        pen.numberofpen = countpen;
    }

    public pen() {
      
    }

    public pen(long id) {
        this.id = id;
       
    }

    public pen(long id, String model) {
        this.id = id;
        this.model = model;
       
    }

    public pen(long id, String model, String brand) {
        this.id = id;
        this.model = model;
        this.brand = brand;
    
    }

    public pen(long id, String model, String brand, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
        numberofpen++;
        
        allpen += toString() + "\n";
        
        
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
      
        return "Pen " + "id " + id + " model " + model + " " + brand + " " + price;
    }
}
