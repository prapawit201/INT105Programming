/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCBABE;

/**
 *
 * @author Windows10
 */
public class SitStudent {
    private String name;
    private int number;
    private String faculty;

    public SitStudent(String name, int number, String faculty) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "SitStudent{" + "name=" + name + ", number=" + number + ", faculty=" + faculty + '}';
    }
    
}
