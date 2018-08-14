package self.model;

public abstract class Customer  {

    private String name;
    private String surname;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + " " + surname;

    }

    public abstract double getDiscountRate();

    public abstract void setDiscountRate(double discountRate);

    public abstract double redeemPoint2Cash(int usePoint);

    public abstract void addPointFromBuyingTotalPrice(double buyingPrice);

    /*public boolean equals (Object obj){
        if(obj !=null && obj instanceof Customer){
            Customer tmp=(Customer)obj;
            if(name.equals(tmp.name)&&(surname.equals(tmp.surname)))
                return true;
               
        }
        return false;
    }*/
    public int compareTo(Customer c) {
        if (name.compareTo(c.name) == 0) {
            return surname.compareTo(c.surname);
        } else {
            return name.compareTo(c.name);
        }
    }
}
