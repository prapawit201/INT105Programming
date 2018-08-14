package self.model;

public class MemberCustomer extends Customer {

    private double points;
    private static double discountRate = 0.2;

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;
    }

    public MemberCustomer() {
    }

    public double getPoints() {
        return points;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        MemberCustomer.discountRate = discountRate;
    }

    public void addPointFromBuyingTotalPrice(double buyingPrice) {
        if (buyingPrice >= 25) {
            points += buyingPrice / 25;
        }
    }

    public double redeemPoint2Cash(int usePoint) {
             double cashCoupon = -1 ;
       if(usePoint<=points){
           if(usePoint < 800){
               cashCoupon = -2 ;
           }else{
               double remainPoint = usePoint%800;
               double deductPoint = usePoint-remainPoint;
               cashCoupon = deductPoint/800*100;
               points=points-deductPoint;
           }
       }else{
               System.out.println("Your points are not enough!");           
       }
       return cashCoupon ; 


//        double cashCoupon = -1;
//        if (usePoint <= points) {
//            if (usePoint < 800) {
//                System.out.println("Your points are less than 800 points!");
//                cashCoupon = -2;
//            } else {
//                double remainPoints = usePoint % 800;
//                double deductPoints = usePoint - remainPoints;
//                cashCoupon = deductPoints / 800 * 100;
//                points = points-deductPoints;
//               
//            }
//        } else {
//            System.out.println("Your points are not enough!");
//        }
//        return cashCoupon;
    }

    @Override
    public String toString() {
        return "Member: " + super.toString() + "\nCurrent Points :" + points;
    }

}
