package Language_fundamentals.Home_work1.assign2;

public class discountEligibilty{
    public static void main(String[] args){
        boolean isStudent = true;
        boolean isSeniorCitizen = false;
        if(isStudent||isSeniorCitizen){
            System.out.println("Allocate discounts elligble");
        }else{
            System.out.println("No discounts available now");
        }
    }
}
