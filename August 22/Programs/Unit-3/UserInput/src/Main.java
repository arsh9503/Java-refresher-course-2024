import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner class came in java 5 --> Right mei object hota hai, left mei reference
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine(); // Will take string input from the terminal
        System.out.println("Welcome to this course, " + name);

        //next() would take just the first word --> it uses space as delimiter by default
        String firstName = scanner.next();
        System.out.println("Your first name is " + firstName);

        //Lets not use the default delimiter
//        scanner.useDelimiter("@");
        String lastName = scanner.next();
        System.out.println("Your last name is " + lastName);

        System.out.printf("Hello brother %s", "Sandhu"); //It is similar to print --> just provides the benefit of using template literals

        // Taking an integer input
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt(); //We didn't defined the value using int literal this time
        System.out.println("Your age is "+ age);

        // If you try to give a string value to a int variable, you will get a compile time error
        try {
            System.out.print("Enter a number of your choice: ");
            int num = scanner.nextInt();
            System.out.println("num = " + num);
        } catch(InputMismatchException e){
            System.out.println("Wrong input");
        }
    }
}