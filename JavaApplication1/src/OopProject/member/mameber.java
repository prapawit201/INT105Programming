package OopProject.member;
import java.util.Scanner;

public class mameber {
	private String memberId ;
	private String memberName ;
	private int memberPoint ;
	private String memberType ; // gold/sliver/platinum
	public String getMemberId() {
    	return memberId;
	}
	public void setMemberId(String memberId) {
    	this.memberId = memberId;
	}
	public String getMemberName() {
    	return memberName;
	}
	public void setMemberName(String memberName) {
    	this.memberName = memberName;
	}
	public int getMemberPoint() {
    	return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
    	this.memberPoint = memberPoint;
	}
	public String getMemberType() {
    	return memberType;
	}
	public void setMemberType(String memberType) {
    	this.memberType = memberType;
	}
	   public String name() {
               Scanner sc = new Scanner(System.in);
               System.out.print("Enter Name to check : ");
               memberName = sc.nextLine();
               return memberName ;
        }
        
        
	public String member(){
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter MemberId : ");
    	memberId=sc.next();
    	sc.nextLine();
    	
    	System.out.print("Enter point : ");
    	memberPoint=sc.nextInt();
    	sc.nextLine();
    	
    	String level = "unknown";
    	String Discount ="";
    	if(memberPoint==0){
        	level = "Normal";
        	Discount = "Discount : 0%" ;
    	}else if(memberPoint<=500){
        	level = "silver";
        	Discount = "Discount : 15%" ;
    	}else if(memberPoint>=500&memberPoint<1000){
        	level = "Gold";
        	Discount = "Discount : 30%" ;
    	}else if(memberPoint>=1000){
        	level = "platinum";
        	Discount = "Discount : 50%" ;
    	}
 	return level ;
	}
 
	
  

	
}

