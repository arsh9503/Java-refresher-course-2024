import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number whose table you want: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
    }

    static void printMultiplicationTable(int num){
        int count = 1;
        while(count<=10){
            System.out.printf("%d x %d = %d\n", num, count, num*count);
            count++;
        }
    }
}
