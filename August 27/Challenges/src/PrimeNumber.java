import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + " is " + (checkIsPrime(num)?"":"not ") + "a prime number.");
    }

    static boolean checkIsPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        int count = 3;
        while(count<num){
            if(num%count == 0){
                return false;
            }
            count+=2;
        }
        return true;
    }
}
