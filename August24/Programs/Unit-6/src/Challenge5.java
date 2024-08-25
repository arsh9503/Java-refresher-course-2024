import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Percentage to grades converter");

        System.out.print("Enter your grades in percentage: ");
        float percentage = scanner.nextFloat();

        if(percentage>90 && percentage <= 100){
            System.out.println("Your grade is A");
        } else if (percentage > 75){
            System.out.println("Your grade is B");
        } else if (percentage > 60){
            System.out.println("Your grade is C");
        } else if (percentage > 30){
            System.out.println("Your grade is D");
        } else if (percentage >= 0) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid percentage");
        }
    }
}
