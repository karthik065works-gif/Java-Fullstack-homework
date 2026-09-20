/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int size = sc.nextInt(); 
		int arr[] = new int[size]; 
		for(int i = 0; i < size;i++){ 
		    System.out.println("Enter the" + (i + 1)+ "element of the array"); 
		    arr[i] = sc.nextInt();
		} 
		int maximum = 0; 
		for(int data:arr){
		    if(data > maximum){
		        maximum = data; 
		    }
		} 
		System.out.println("The maximum element in the array is" + maximum); 
	}
}
