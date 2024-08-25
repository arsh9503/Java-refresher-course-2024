import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of Interest (R): ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the time period in years (T): ");
        float time = scanner.nextFloat();

        System.out.println("The simple interest on amount " + principal + " on " + rate + "% interest per annum for " + time + " years is " + (principal*rate*time)/100) ;
    }
}
