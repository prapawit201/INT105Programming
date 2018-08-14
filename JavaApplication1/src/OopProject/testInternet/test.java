
package OopProject.testInternet;

public class test {
    private int total;
    private String name ;
    private static int field;
    
    public test(){
        this.name=name;
        field++;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public test(int total) {
        this.total = total*total;
        field++;
         
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static int getField() {
        return field;
    }

    public static void setField(int field) {
        test.field = field;
    }

    @Override
    public String toString() {
        return "test{" + "total=" + total + '}';
    }
    
}
