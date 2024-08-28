import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + " is " + (checkIsPalindrome(num)?"":"not ") + "a palindrome");
    }

    static boolean checkIsPalindrome(int num){
        int reversedNumber = 0;
        int temp = num;
        while(temp>0){
            reversedNumber*=10;
            reversedNumber+=temp%10;
            temp/=10;
        }
        return reversedNumber == num;
    }
}
