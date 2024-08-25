import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float numOne = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float numTwo = scanner.nextFloat();
        System.out.printf("The product of %.2f and %.2f is %.2f\n", numOne, numTwo, numOne*numTwo);
    }
}
