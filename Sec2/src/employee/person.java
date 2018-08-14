
package employee;

public class person {
    //ถ้าในใบงานขึ้น #คือเป็น protected
    private String name;
    protected String address;
    protected String phonenumber;
    protected String emailaddress;

    public person(String name) {
        this.name = name;
    }

    
    
    public person(String name, String address, String phonenumber, String emailaddress) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getsignature(){
        String result ;
        result = name.substring(0,2);
        result += name.substring(-2);
        return result.toUpperCase();
    }
    @Override
    public String toString() {
        return "person{" + "name=" + name + ", address=" + address + ", phonenumber=" + phonenumber + ", emailaddress=" + emailaddress + '}';
    }
    
}
