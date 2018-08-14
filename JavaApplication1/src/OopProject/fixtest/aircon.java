package OopProject.fixtest;
    public class aircon{
        private String model;
        private String brand;
        private int celsius;
        private boolean status;

    public aircon(String model, String brand, boolean status) {
        this.model = model;
        this.brand = brand;
        this.status = status;
        celsius = 25;
    }

    public aircon() {
        model = "unknow";
        celsius = 25;
    }
    
    public String convertToFah(){
        double f = (9*celsius)/5+32;
        return f+"F";
    }
    public void toocold(){
        if(status==true){
           celsius=celsius-1;
        }else{
            System.out.println("IT's OFF");
        }
    }
    public void toowarm(){
        if(status==true){
           celsius=celsius+1;
        }else{
            System.out.println("IT's OFF");
        }
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    


}
