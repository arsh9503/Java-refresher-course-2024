import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int numOne = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int numTwo = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int numThree = scanner.nextInt();

        if(numOne>numTwo && numTwo>numThree){
            System.out.printf("The greatest number is %d\n", numOne);
        } else if (numOne<numTwo && numTwo>numThree) {
            System.out.printf("The greatest number is %d\n", numTwo);
        } else {
            System.out.printf("The greatest number is %d\n", numThree);
        }
    }
}
