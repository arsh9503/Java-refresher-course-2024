import java.util.Scanner;

public class GetGCD {
    public static void main(String[] args){
        int numOne = getInput("Enter the first number");
        int numTwo = getInput("Enter the second number");
        System.out.printf("The GCD of %d and %d is %d\n", numOne, numTwo, getGCD(numOne, numTwo));
    }

    static int getInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }

    static int getGCD(int numOne, int numTwo){
        int gcd = 1;
        int count = Math.min(numOne, numTwo);
        while(count>0){
            if(numOne%count == 0 && numTwo%count == 0){
                gcd = count;
                return gcd;
            }
            count--;
        }
        return gcd;
    }
}
