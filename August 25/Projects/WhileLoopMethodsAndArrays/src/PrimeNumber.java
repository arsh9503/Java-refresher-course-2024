import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int num = getInput("Enter a number");
        System.out.println(num + " is" + (isPrime(num)?"": " not") + " a prime number");
    }

    static boolean isPrime(int num){
        if(num<=1) return false;
        if(num == 2) return true;
        if(num%2 == 0) return false;
        int count = 3;
        while(count<=Math.sqrt(num)){
            if(num%count==0){
               return false;
            }
            count+=2;
        }
        return true;
    }

    static int getInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}
