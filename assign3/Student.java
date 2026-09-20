
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Students Database");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of records to be fetched");
        int size = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Student[] student = new Student[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Enter the name");
            String name = sc.nextLine();

            System.out.println("Enter the score");
            int score = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            student[i] = new Student(name, score);

            System.out.println("The data is stored successfully");
        }

        System.out.println("\nStudent Details:");

        for (Student s : student) {
            s.printDetails();
        }

        sc.close();
    }
}

