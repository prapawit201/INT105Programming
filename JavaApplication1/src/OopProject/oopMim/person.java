
package OopProject.oopMim;

public class person {
    private String name;
    private String gender ;
    private static int countall;
    
    
    public int numOfPerson(){
        return countall;
    }
    
    public static int getCountall() {
        return countall;
    }

    public static void setCountall(int countall) {
        person.countall = countall;
    }

    public person() {
        countall++;
    }

    public person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        countall++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString(){
        return "person { " + "name "+ name + ", gender " + gender +" }";
    }

}
