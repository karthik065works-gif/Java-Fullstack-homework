package Language_fundamentals.Home_work1.assign2;

public class gradeCalculator {
    public static  void main(String[] args){
        int marks = 100;
        if(marks >= 90){
            System.out.println("the grade is A+");
        }else if(marks >= 75){
            System.out.println("The grade is A");
        }else if(marks >= 60){
            System.out.println("The grade is B");
        }else if(marks >= 40){
            System.out.println("The grade is C");
        }else{
            System.out.println("The student failed no grade allocated ");
        }
    }
}
