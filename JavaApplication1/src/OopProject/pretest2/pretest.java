/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject.pretest2;


public class pretest {
    private long id;
    private String name, detail;

    public pretest(long id) {
        this.id = id;
    }
    public pretest(long id , String name){
        this(id);
        this.name = name ;
    }
    public pretest(long id , String name , String detail){
        this(id , name);
        this.detail = detail ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }



}
