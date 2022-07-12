package abstractClass;
import java.util.Scanner;

// import Shape1;

abstract class Shape1{
    abstract void area();

}

class Rectangle1 extends Shape1{
    void area(){
        int length, breadth, area;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter length and breadth of rectangle");
        length = sc.nextInt();
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
        sc.close();
    }
}

class AbstractClass{
    public static void main(String[] args) {
        Shape1 shape = new Rectangle1();
        shape.area();
    }
}