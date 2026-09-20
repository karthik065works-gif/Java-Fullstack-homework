/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Vehicle{
  String brand;
  int speed;
  Vehicle(String brand,int speed){ 
      System.out.println("The constructor of the parent class is called"); 
      this.brand = brand; 
      this.speed = speed; 
  } 
  void getDetails(){
      System.out.println("Brand Name:" + brand); 
      System.out.println("Speed:" + speed);
  }
} 
class car extends Vehicle{
    String fuelType;
    car(String brand,int speed,String fuelType){ 
        System.out.println("The constructor of the child class is called"); 
        super(brand,speed); 
        this.fuelType = fuelType; 
    } 
    void showDetails(){
        System.out.println("brand is:" + brand); 
        System.out.println("Max speed is:" + speed); 
        System.out.println("fuelType is"  +fuelType); 
    } 
    
}
public class Main
{
	public static void main(String[] args) {
		String Name = "Toyota"; 
		int maxSpeed = 180; 
		String fuelType = "Petrol"; 
		Vehicle v1 = new Vehicle(Name,maxSpeed); 
		car c1 = new car(Name,maxSpeed,fuelType); 
	}
}
