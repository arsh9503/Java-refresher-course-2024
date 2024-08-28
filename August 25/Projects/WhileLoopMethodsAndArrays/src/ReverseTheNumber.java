import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.printf("On reversing %d becomes %d", num, reverseNum(num));
    }

    static int reverseNum(int num){
        String newNum = "";
        while(num>0){
            newNum+=Integer.toString(num%10);
            num/=10;
        }
        return Integer.parseInt(newNum);
    }
}
