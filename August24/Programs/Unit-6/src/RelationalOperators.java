import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        //Order of relational operators is less than arithmetic operators
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Road Transport Office");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age>=18) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("Beta, cycle chalao");
        }

        //If age < 5 ==> 75% discount else if age > 60 25% discount else if female 50% discount

        //Logical Operators AND: && OR: || not: !
        // Lower priority than Math and Comparison Operators



    }
}
