import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.printf("The fibonacci series upto %d is %s\n", num, getFibonacci(num));
    }

    public static String getFibonacci(int num) {
        if (num <= 0) return ""; // Handle invalid input
        if (num == 1) return "0"; // Handle special case for num = 1

        StringBuilder fibonacciSeries = new StringBuilder();
        int a = 0, b = 1; // First two Fibonacci numbers
        int count = 0; // Counter for the number of terms added

        while (count < num) {
            if (count > 0) {
                fibonacciSeries.append(", ");
            }
            fibonacciSeries.append(a);
            int next = a + b; // Compute the next Fibonacci number
            a = b; // Update previous numbers
            b = next;
            count++;
        }

        return fibonacciSeries.toString();
    }

}
