package Language_fundamentals.Home_work1.mini_prject;

public class StudentProfile { 
    public static void main(String[] args) { 
        String studentName = "Karthik"; 
        int rollNumber = 106122065;
        String collegeName = "NIT Trichy"; 
        int semester = 8; 
        int javaMark = 80;
        int dataBaseMark = 70; 
        int webTechMark = 60; 
        int totalMark = javaMark + dataBaseMark + webTechMark ; 
        double percent = totalMark/3; 
        char grade = 'C'; 
        boolean passStatus = true; 
        System.out.println("StudentName:" + studentName); 
        System.out.println("Rollnumber:"+rollNumber); 
        System.out.println("collegeName:"+collegeName); 
        System.out.println("Semester:"+semester); 
        System.out.println("Java Marks:" + javaMark); 
        System.out.println("databaseMarks" + dataBaseMark); 
        System.out.println("Webtech Marks" + webTechMark); 
        System.out.println("total obtained:" + totalMark); 
        System.out.println("percentage scored:" + percent); 
        System.out.println("Grade obtained" + grade); 
        System.out.println("Pass-status:"+passStatus); 


        
    }
    
}
