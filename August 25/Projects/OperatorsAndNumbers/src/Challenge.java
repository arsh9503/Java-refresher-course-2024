import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 15: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter another number between 0 and 15: ");
        int numTwo = scanner.nextInt();
        if((numOne>15 || numOne<0) || (numTwo>15 || numTwo<0)){
            System.out.println("Please make sure that the numbers are between 0 and 15. Try again!");
        } else {
            System.out.printf("The bitwise AND of %d and %d is %d\n", numOne, numTwo, numOne&numTwo);
            System.out.printf("The bitwise OR of %d and %d is %d\n", numOne, numTwo, numOne|numTwo);
            System.out.printf("The bitwise XOR of %d and %d is %d\n", numOne, numTwo, numOne^numTwo);
            System.out.printf("The bitwise complement of %d is %d\n", numOne, ~numOne);
            System.out.printf("The bitwise complement of %d is %d\n", numTwo, ~numTwo);
            System.out.printf("%d bitwise shifted right by %d results in %d\n", numOne, numTwo, numOne>>numTwo);
            System.out.printf("%d bitwise shifted left by %d results in %d\n", numOne, numTwo, numOne<<numTwo);
        }
    }
}
