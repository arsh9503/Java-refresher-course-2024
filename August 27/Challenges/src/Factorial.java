import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.printf("The factorial of %d is %d", num, getFactorial(num));
    }

    static int getFactorial(int num){
        int factorial = 1;
        int count = num;
        while(count>0){
            factorial*=count;
            count--;
        }
        return factorial;
    }
}
