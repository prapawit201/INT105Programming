
package employee;


public class faculty extends employee{
    private String officehours;
    private String rank ;

    public faculty(String name) {
        super(name);
    }

    public faculty(String officehours, String rank, String name, String office, double salary) {
        super(name, office, salary);
        this.officehours = officehours;
        this.rank = rank;
    }

    public faculty(String officehours, String rank, String name, String address, String phonenumber, String emailaddress, String office, double salary) {
        super(name, address, phonenumber, emailaddress, office, salary);
        this.officehours = officehours;
        this.rank = rank;
    }
    
    
    public String getOfficehours() {
        return officehours;
    }

    public void setOfficehours(String officehours) {
        this.officehours = officehours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"faculty{" + "officehours=" + officehours + ", rank=" + rank + '}';
    }
    
}
