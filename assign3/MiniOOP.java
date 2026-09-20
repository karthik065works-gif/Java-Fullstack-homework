/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Mini project on OOPs System 
class User{
    String Name;
    String Email; 
    User(String Name,String Email){
        this.Name = Name; 
        this.Email = Email; 
    } 
    void showProfile(){
        System.out.println("Name:" + Name);
        System.out.println("Email:" + Email); 
    }
} 
class Student extends User{
    String courseName;
    Student(String Name,String Email,String courseName){
        super(Name,Email); 
        this.courseName = courseName; 
    } 
    //super.showProfile(); 
} 
class Trainer extends User{
    String subject; 
    Trainer(String Name,String Email,String subject){
        super(Name,Email); 
        this.subject = subject; 
    }  
    //super.showProfile();
    
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to the Retrieval Database"); 
		Student s1 = new Student("KARTHIK S","Karthik@google.com","Java"); 
		Trainer t1 = new Trainer("KISHORE GN","Kishore@rps.com","Javafullstack"); 
		s1.showProfile();
		t1.showProfile();
	}
}
