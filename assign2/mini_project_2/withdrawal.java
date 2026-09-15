package Language_fundamentals.Home_work1.mini_projects2;

public class Atm {
    public static void main(String[] args){
        int balance = 70000;
        int withdrawalAmt = 25000;
        if(withdrawalAmt <= balance){
            System.out.println("The withdrawal option is allowed");
            int currentBalance = balance - withdrawalAmt;
            System.out.println("The available balance is " + currentBalance);
        }else{
            System.out.println("add funds insufficient balance");
        }
    }
}
