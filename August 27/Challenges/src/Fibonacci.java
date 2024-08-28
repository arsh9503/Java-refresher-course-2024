import java.util.Scanner;
import java.lang.StringBuilder;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("The fibonacci series upto " + num + " is " + getFibonacciSeries(num));
    }

    static String getFibonacciSeries(int num){
        StringBuilder result = new StringBuilder();
        int firstNumber = 0;
        int secondNumber = 1;
        int count = 0;
        while(count<num){
            result.append(firstNumber + ((count+1==num)?"":", "));
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            count++;
        }
        return result.toString();
    }
}
