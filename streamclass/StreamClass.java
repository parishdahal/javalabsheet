package streamclass;
import java.util.Scanner;

public class StreamClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        System.out.println("Please enter your name and your roll no");

        name = sc.nextLine();
        roll = sc.nextInt();
        sc.close();
        System.out.println("name is " + name + " and " + "roll is " + roll );
    }
}