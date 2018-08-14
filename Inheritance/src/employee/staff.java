package employee;

public class staff extends employee {
    private String tittle;
    
    public staff(String name) {
        super(name);

    }

    public staff(String tittle, String name) {
        super(name);
        this.tittle = tittle;
    }

    public staff(String tittle, String name, String office, double salary) {
        super(name, office, salary);
        this.tittle = tittle;
    }

    public staff(String tittle, String name, String address, String phonenumber, String emailaddress, String office, double salary) {
        super(name, address, phonenumber, emailaddress, office, salary);
        this.tittle = tittle;
    }
    
    
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return super.toString()+"staff{" + "tittle=" + tittle + '}';
    }
    
}
