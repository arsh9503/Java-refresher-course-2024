import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numTwo = scanner.nextInt();
        System.out.printf("The sum of %d and %d is %d", numOne, numTwo, numOne+numTwo);
    }
}
