
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name){
        System.out.println("The first constructor is called"); 
        this.id = id;
        this.name = name; 
    } 
    Employee(int id,String name,double salary){
        System.out.println("The second constructor is called overloading started"); 
        this(id,name); 
        this.salary = salary; 
    }
}
public class Main
{
	public static void main(String[] args) { 
	    int id = 90119818; 
	    String Name = "Karthik"; 
		System.out.println("Demonstration of constructor overloading"); 
		Employee e1 = new Employee(id,Name);  
		Employee e2 = new Employee(id,Name,1500.00);
	}
}
