package employee;

public class student extends person {
    //(freshman,sophomore, junior, or senior
    public static enum Status{freshman,sophomore, junior, senior};//คือกรอกได้เเค่4 ตัวนี้เท่านั้น
    Status status;
    //Status status = Status.freshman; //คือกรอกได้เเค่freashman เท่านั้นใส่อย่างอื่นไม่ได้
    public student(String name,Status status) {
        super(name);
        this.status = status;
    }    

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public boolean equals(Object obj){
        boolean result = false ;
        if(obj != null && obj instanceof student){
            if(super.getName()==((student)obj).getName()){
                result = true ;
            }
        }
        return result ;
    }
    @Override
    public String getsignature(){
        String result ;
        result = super.getName().substring(0,2);
        result+="-"+ super.getName().substring(super.getName().length()-2);
        return result.toUpperCase();
    }
    @Override
    public String toString() {
        return super.toString()+"\nstudent{" + "status=" + status + '}';
    }
    
    
}