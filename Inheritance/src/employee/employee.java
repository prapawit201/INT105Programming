package employee;
//ถ้าจะบอกเป็นลูกperson ต้องใส่extends

public class employee extends person {

    protected String office;
    protected double salary;

    public employee(String name) {
        super(name);
    }
    

    public employee(String name, String office, double salary) {
        super(name);
        this.office = office;
        this.salary = salary;
    }

    public employee(String name, String address, String phonenumber, String emailaddress, String office, double salary) {
        super(name,address,phonenumber,emailaddress);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nemployee{" +" name= "+ super.getName()+ " office =" + office + ", salary =" + salary + '}';
    }

    
}