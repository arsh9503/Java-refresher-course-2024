import java.util.Scanner;

public class OddEvenFinder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int mask = 1;
        if((num&mask) == 1){
            System.out.println(num + " is an odd number");
        } else {
            System.out.println(num + " is an even number");
        }
    }
}

