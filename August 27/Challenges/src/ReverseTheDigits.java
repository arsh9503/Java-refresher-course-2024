import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("On reversing, " + num + " becomes " + reverseDigits(num));
    }

    static int reverseDigits(int num){
        int reversedNumber = 0;
        while(num>0){
            reversedNumber*=10;
            reversedNumber+=num%10;
            num/=10;
        }
        return reversedNumber;
    }
}
