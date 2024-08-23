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
        scanner.useDelimiter("@");
        String lastName = scanner.next();
        System.out.println("Your last name is " + lastName);

        System.out.printf("Hello brother %s", "Sandhu"); //It is similar to print --> just provides the benefit of using template literals



    }
}