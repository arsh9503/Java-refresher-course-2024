import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("sum of all the odd numbers from 1 to " + num + " is " + getSumOfOdds(num));
    }

    static int getSumOfOdds(int num){
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
