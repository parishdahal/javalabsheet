package javaPackage;
import java.util.Scanner;

import javaPackage.college.College;

public class Student {
	
	public static void main(String[] args) {
		String name, address;
		int phone;
		
		College college = new College();
		System.out.println("Enter your college details");
		Scanner scanner = new Scanner(System.in);
		
		name = scanner.nextLine();
		address = scanner.nextLine();
		phone = scanner.nextInt();
		
		college.setCollegeData(name, address, phone);
		college.getCollegeData();
		
		scanner.close();
	}
	
}
