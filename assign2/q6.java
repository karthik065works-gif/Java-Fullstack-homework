package Language_fundamentals.Home_work1.assign2;

public class largestof3 {
    public static void main(String[] args) {
        int num1 = 47;
        int num2 = 47;
        int num3 = 47;
        if (num1 > num2 && num1 > num3) {
            System.out.println("the largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("the largest number is " + num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("the largest number is " + num3);
        } else {
            System.out.println("all the numbers are equal");
        }
    }
}
