/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject.pretest1;

/**
 *
 * @author Windows10
 */
public class student {
    private String name ;
    private String id ;
    private String year ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String checkid(String id){
        String result = "ผลลัพท์ : ";
          if (id.length()==11){
            System.out.println(result+"Student in KMUTT");
        }else{
            System.out.println(result+"Can't Check");
        }
        return result ;
    }

    public student(String name, String id, String year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }
    public String checkcana(String id){
        String result ="ผลลัพท์ : ";
        if(id.substring(2, 9).equals("1305000")){
            System.out.println(result+"you are IT student");
        }else{
            System.out.println(result+"i don't know about you");
        }
        return result ;
    }
    public String checkyear(String id){
        String result = "ผลลัพท์ :";
        if(id.substring(0, 2).equals("60")){
            System.out.println(result+" นักศึกษาปี1");
        }else if(id.substring(0, 1).equals("59")){
            System.out.println(result+" นักศึกษาปี2");
        }else if(id.substring(0, 1).equals("58")){
            System.out.println(result+" นักศึกษาปี3");
        }else if(id.substring(0, 1).equals("57")){
            System.out.println(result+" นักศึกษาปี4");
        }else{
            System.out.println(result+"ไม่มีในทะเบียน");
        
    }
        return result;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", id=" + id + ", year=" + year + '}';
    }
    
}
