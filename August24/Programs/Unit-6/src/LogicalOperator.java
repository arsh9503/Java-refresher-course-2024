import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Ticket Discount Calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender? ");
        String gender = scanner.next().toLowerCase();

        if(age<5){
            System.out.println("You got 75% discount");
        } else if (gender.equals("female")){
            System.out.println("You got 50% discount");
        } else if(age>60 && !gender.equals("female")){
            System.out.println("You got 25% discount");
        } else {
            System.out.println("You got no discount!");
        }
    }
}
