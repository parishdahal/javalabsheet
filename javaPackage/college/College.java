package javaPackage.college;

public class College {
	String collegeName, collegeAddr;
	int collegePhoneNo;
	
	public void setCollegeData(String colName, String colAddr, int colPhone) {
		collegeName = colName;
		collegeAddr = colAddr;
		collegePhoneNo = colPhone;
	}
	
	public void getCollegeData() {
		System.out.println("your college name is " + collegeName);
		System.out.println("Your college address is " + collegeAddr );
		System.out.println("your college phone number is " + collegePhoneNo);
	}
}
