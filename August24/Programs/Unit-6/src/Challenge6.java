import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age categorizer");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age<13){
            System.out.println("You are a child");
        } else if (age < 20){
            System.out.println("You are a teen");
        } else if (age < 60){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }
    }
}
