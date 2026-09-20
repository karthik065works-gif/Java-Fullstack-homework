/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class bankAccount{
    private int accountNumber;
    private double balance; 
    bankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance; 
    }
    void deposit(double amount){
        System.out.println("The deposit service has been invoked"); 
        balance += amount; 
        System.out.println("The updated balance is " + balance); 
    } 
    void withdrawal(double amount){  
        if(amount > balance){
            System.out.println("Insufficient funds in the account");
        }else{
            System.out.println("The withdrawal is successfull for amount:" + amount); 
            balance -= amount; 
            System.out.println("The remaining balance is " + balance); 
        } 
        
    } 
    void display_balance(){
        System.out.println("The balance available is " + balance); 
    }
        
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to the account access services "); 
		bankAccount b1 = new bankAccount(1800121,100000.00); 
		b1.deposit(10000.00);
		b1.withdrawal(100.00); 
		b1.display_balance(); 

	}
}
