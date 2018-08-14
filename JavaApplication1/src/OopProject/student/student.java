package OopProject.student;

public class student {
	private long stdId;
	private String stdName;
 
	
//getter name
	public String getStdName() {
    	return stdName;
	}
	//setter name
	public void setStdName(String stdName) {
    	this.stdName = stdName;
	}
	
	//getter id
	public long getStdId(){
    	return stdId;
	}
	//setter id
	public void setStdId(long stdId){
    	this.stdId=stdId ; //ใช้ this. เมื่อชื่อเหมือน
	}
   	@Override // ห้ามเปลี่ยน header String toString
	public String toString() {
    	return "student{" + "stdId=" + stdId + ", stdName=" + stdName + '}';
	}
}