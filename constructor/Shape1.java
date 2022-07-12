package constructor;
// use of constructor

import java.util.Scanner;

public class Shape1 {
    
    private float length, breadth, area;
    
    public Shape1(float length, float breadth){
        this.length = length;
        this.breadth = breadth;

    }

    void getArea(){
        area = length * breadth;
        System.out.println("the area of the rectangle is" + area);
    }
    public static void main(String[] args) {
        float length, breadth;
        System.out.println("Enter the length and breadth of the rectangle");

        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        
        Shape1 rect = new Shape1(length, breadth);
        sc.close();
        rect.getArea();
    }


    
}
