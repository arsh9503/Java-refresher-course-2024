import java.util.Scanner;

public class Challenges {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numTwo = scanner.nextInt();
        System.out.printf("The sum of %d and %d is %d\n", numOne, numTwo, numOne+numTwo);
        System.out.printf("The difference of %d and %d is %d\n", numOne, numTwo, numOne-numTwo);
        System.out.printf("The product of %d and %d is %d\n", numOne, numTwo, numOne*numTwo);
        System.out.printf("The quotient of %d divided by %d is %d\n", numOne, numTwo, numOne/numTwo);
        System.out.printf("The remainder of %d divided by %d is %d\n", numOne, numTwo, numOne%numTwo);
    }
}
