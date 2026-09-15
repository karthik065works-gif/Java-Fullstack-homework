package Language_fundamentals.Home_work1.assign2;

public class loginCheck {
    public static void main(String[] args){
        String Name = "Karthik";
        String Password = "Nitt@2026";
        if(Name == "Karthik"){
            if(Password == "Nitt@2026"){
                System.out.println("Login allowed");
            }else{
                System.out.println("Check the password entered");
            }
        }else{
            System.out.println("Check the userName entered");
        }
    }
}
