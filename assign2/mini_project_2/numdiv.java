package Language_fundamentals.Home_work1.mini_projects2;

public class numdivisibilty{
    public static void main(String[] args){
        int num1 = 65;
        if(num1%3 == 0 && num1%5 == 0){
            System.out.println("The number is divisible by 3 & 5" + num1);
        }else if(num1%3 == 0 && num1%5 != 0){
            System.out.println("The number is only divisible by 3 only" + num1);
        }else if(num1%3 != 0 && num1%5 == 0){
            System.out.println("the number is only divisble by 5 not by 3: " + num1);
        }else{
            System.out.println("the number is not divisible by any of 3 and 5");
        }
    }

}
