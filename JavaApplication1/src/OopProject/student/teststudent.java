package OopProject.student;

public class teststudent {
	public static void main(String[] args) {
    	student std1=new student();
    	
    	long id = std1.getStdId();
    	
    	std1.setStdId(60130500051l);
    	System.out.println("Id = "+std1.getStdId());
    	
    	
    	student std2=new student();
   	
    	String name = std2.getStdName();
    	
    	std2.setStdName("Prapawit Prasoppanit");
    	System.out.println("Name = "+std2.getStdName());
    	

