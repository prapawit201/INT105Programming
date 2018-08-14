
package OopProject.EmployeetestRun;

public class employee {
   private String name;
   private double salary;
   private boolean fulltime;
   
   private static int countall,countful,countpart;

    public employee(String name) {
        this.name = name;
        salary = 0;
        fulltime = false ;
        countall++;
    }

    public employee(String name, double salary, boolean fulltime) {
        countall++;
        this.name = name;
        this.salary = salary;
        this.fulltime = fulltime;
        if(fulltime == true){
            countful++;
        }else if(fulltime == false){
            countpart++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    public static int getCountall() {
        return countall;
    }

    public static void setCountall(int countall) {
        employee.countall = countall;
    }

    public static int getCountful() {
        return countful;
    }

    public static void setCountful(int countful) {
        employee.countful = countful;
    }

    public static int getCountpart() {
        return countpart;
    }

    public static void setCountpart(int countpart) {
        employee.countpart = countpart;
    }

    @Override
    public String toString() {
        return "employee{" + "name=" + name + ", salary=" + salary + ", fulltime=" + fulltime + '}';
    }
    


    
   
       
    
    
     

}
