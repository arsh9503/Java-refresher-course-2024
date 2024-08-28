import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + " is " + (checkIsArmstrong(num)?"": "not ") + "a armstrong number");
    }

    static boolean checkIsArmstrong(int num){
        int count = 1;
        while(count<=9){
            int temp = num;
            int sum = 0;
            while(temp>0){
                sum+=Math.pow(temp%10, count);
                temp/=10;
            }
            if(sum==num){
                return true;
            }
            count++;
        }
        return false;
    }
}
