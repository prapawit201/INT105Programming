/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject.ChokunHelp;

/**
 *
 * @author Windows10
 */
public class chokun {
    
    private String name;
    private long id;
    private double height;

    private static int num;
    
    
 

    public chokun(long id, double height) {
        
        this.id = id;
        this.height = height;
        num++;
    }
    public chokun(String name, long id, double height) {
        this.name = name;
        this.id = id;
        this.height = height;
        num++;
    }

    public static int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "NewClass1{" + "name=" + name + ", id=" + id + ", height=" + height + '}';
    }
    
    
}

