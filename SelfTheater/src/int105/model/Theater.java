package int105.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tisanai.Cha
 */
public class Theater {

    private int theaterId;
    private Seat[] seats;

    public Theater() {
    }

    public Theater(int theaterId, Seat[] seats) {
        this.theaterId = theaterId;
        this.seats = seats;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public boolean reserveSeat(int seatId) {
//        if (seatId > 0 && seatId <= seats.length) {
//            if (!seats[seatId-1].isSeatSelected()) {
//                seats[seatId-1].setSeatSelected(true);
//                return true;
//            }
//        }
//        return false;

        for (int i = 0 ; i < seats.length ; i++) {
            if (seats[i].getSeatId() == seatId && !seats[i].isSeatSelected()) {
                seats[i].setSeatSelected(true);
                return true;
            }
        }
        return false;
    }

    public int countNoReserveSeat() {
//        int count = 0 ;
//        for(int i = 0 ; i < seats.length;i++){
//            if(seats[i].isSeatSelected()==false){
//                count++;
//            }
//        }
//        return count ;
            int count = 0 ; 
            for(int i = 0 ; i < seats.length;i++){
                if(seats[i].isSeatSelected()==false){
                    count++;
                }
            }
            return count ;
    }

    public int countNoReserveSeat(String classSeat) {
        int count = 0;
        for (int i = 0 ; i < seats.length ; i++){
            if(seats[i].getClassSeat().equalsIgnoreCase(classSeat) && !seats[i].isSeatSelected()){
                count++;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Seat[] seats = {
//            new Seat(1, "Normal", false),
//            new Seat(2, "Normal", false),
//            new Seat(3, "Normal", false),
//            new Seat(4, "Normal", true),
//            new Seat(5, "Normal", true),
//            new Seat(6, "Normal", false),
//            new Seat(7, "Normal", false),
//            new Seat(8, "Normal", false),
//            new Seat(9, "Honeymoon", false),
//            new Seat(10, "Honeymoon", true),
//            new Seat(11, "Honeymoon", true),
//            new Seat(12, "Honeymoon", false)};
//        Theater theater = new Theater(1, seats);
//        System.out.println(theater.countNoReserveSeat("Normal"));
//
//    }

    @Override
    public String toString() {
        String seatAll = "";
        for (Seat seat : seats) {
            seatAll += seat.toString() + "\n";
        }
        return "Theater{" + "theaterId=" + theaterId + "\nseats=" + seatAll + '}';
    }

}
