package trainerapp;

public class Elliptical implements exercisemachine {

    private String name;
    private int price;

    public Elliptical() {
        this.name = "elliptical";
        this.price = 17500;
    }

    @Override
    public int helpMetabolism() {
        return 400;
    }
}
