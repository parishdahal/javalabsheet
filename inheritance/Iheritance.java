package inheritance;

class Vehicle {

    // Private Fields
    private String maker; 
    private int year;      
    private String model;   
    private String color;
    private int mileage;



    public Vehicle(String maker, String color, int year, String model, int mileage) {
      this.maker = maker;
      this.color = color;
      this.year = year;  
      this.model = model;
      this.mileage = mileage;
    }

    public void printDetails() {
      System.out.println("Manufacturer: " + maker);
      System.out.println("Color: " + color);
      System.out.println("Year: " + year);
      System.out.println("Model: " + model);
      System.out.println("mileage: " + mileage);
    }

  }

  class Car extends Vehicle {


    private String bodyStyle;


    public Car(String maker, String color, int year, String model, String bodyStyle, int mileage) {

      super(maker, color, year, model, mileage); 
      
      this.bodyStyle = bodyStyle;       
    }

    public void carDetails() {  
      printDetails();         
      System.out.println("Body Style: " + bodyStyle);
    }

  }

  class Inheritance {

    public static void main(String[] args) {
      System.out.println("Parish Dahal 019-348");
      Car hyundai = new Car("Hyundai", "silver", 2022, "crete", "Suv", 22 ); //creation of car Object
      hyundai.carDetails(); //calling method to print details
    }

  }