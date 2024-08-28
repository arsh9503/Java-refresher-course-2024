import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.printf("The sum of all the odd numbers upto %d is %d\n", num, sumOfOddNumbers(num));
    }

    static int sumOfOddNumbers(int num){
        int sum = 0;
        int count = 1;
        while(count<=num){
            if(count%2!=0){
                sum+=count;
            }
            count++;
        }
        return sum;
    }
}
