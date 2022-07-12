package interfaceinjava;

import java.util.Scanner;

interface StudentInterface{
	public void setStudentData();
	public void printStudentData();
	
}

class ShowStudentData implements StudentInterface{
	String name, address;
	int rollNo;
	
	public void setStudentData() {
		System.out.println("enter your details");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		address = scanner.nextLine();
		rollNo = scanner.nextInt();
		scanner.close();
	}
	public void printStudentData() {
		System.out.println("your name is " + name);
		System.out.println("your address  is " + address);
		System.out.print("your roll no is " +rollNo );
	}
}

public class SimpleInterface{
	public static void main(String args[]) {
		ShowStudentData sh = new ShowStudentData();	
		sh.setStudentData();
		sh.printStudentData();
	}
	
}