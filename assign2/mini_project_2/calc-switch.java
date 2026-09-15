package Language_fundamentals.Home_work1.mini_projects2;

public class Calculator_switch {
    public static void main(String[] args){
        int num1 = 65;
        int num2 = 47;
        char operation = 'L';
        switch(operation){
            case '+':
                System.out.println("The addition operation is called");
                int sum = num1 + num2;
                System.out.println("The sum is" + sum);
                break;
            case '-':
                System.out.println("The subtraction operation is chosen");
                int dif = num1 - num2;
                System.out.println("The difference is " + dif);
                break;
            case '/':
                System.out.println("the division operation is chosen");
                int div = num1/num2;
                System.out.println("the division operation is there :" + div );
                break;
            case '*':
                System.out.println("the multiplication operation is chosen");
                int mul = num1*num2;
                System.out.println("the multiplication is " + mul);
                break;
            case '%':
                System.out.println("The modulo operation is triggered");
                int mod = num1%num2;
                System.out.println("the modulo is " + mod);
                break;
            default:
                System.out.println("Enter a valid operation");


        }
    }
}
