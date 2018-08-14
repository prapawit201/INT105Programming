
package trainerapp;

public class Treadmill implements exercisemachine {
    private String name;
    private  int price;

    public Treadmill(String name, int price) {
        this.name = "treadmil";
        this.price = 25000;
    }

    public Treadmill() {
    }
    
    @Override
    public int helpMetabolism(){
        return 350 ;
    }
}
