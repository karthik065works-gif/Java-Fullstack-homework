package Language_fundamentals.Home_work1.assign2;

public class Menus {
    public static void main(String[] args){
        int availableBalance = 1000;
        int choice = 3;
        switch(choice){
            case 1:
                System.out.println("Welcome to add money service");
                availableBalance += 1000;
                System.out.println("The new balance is " + availableBalance);
                break;
            case 2:
                System.out.println("Welcome to withdrawal service");
                availableBalance -= 500;
                System.out.println("the new balance is " + availableBalance);
                break;
            case 3:
                System.out.println("Welcome to checkBalance service");
                System.out.println("The available_balance is" + availableBalance);
                break;
            case 4:
                System.out.println("logging out activity initiated");
                break;
            default:
                System.out.println("Enter a valid option");

        }
    }
}
