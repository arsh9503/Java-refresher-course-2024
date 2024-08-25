import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (R): ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the Time period in years (T): ");
        float time = scanner.nextFloat();

        System.out.println("The compound interest on amount " + principal + " on " + rate + "% interest per annum for " + time + " years is " + Math.round(principal*Math.pow((1+(rate/100)), time)));
    }
}
