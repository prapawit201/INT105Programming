
package safetiwfinal.Exception;



public class handlerExeption {
    public static void main(String[] args) {
        try{
            int a = 10;
            System.out.println(a/0);
        }catch(Exception ex){
           ex.getMessage();
        }finally{
            System.out.println("Finish");
        }
    }
}
