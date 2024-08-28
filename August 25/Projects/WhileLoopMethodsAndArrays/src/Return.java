import java.util.Scanner;

public class Return {
    public static void main(String[] args){


        int numOne = getInput("Enter the first number");
        int numTwo = getInput("Enter the second number");

        System.out.printf("Sum of %d and %d is %d\n", numOne, numTwo, addTwoNumbers(numOne,numTwo));
    }

    static int addTwoNumbers(int numOne, int numTwo){
        return numOne + numTwo;
    }


    static int getInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}
