import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Even/Odd Determiner");

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.printf("%d is an even number\n", num);
        } else {
            System.out.printf("%d is a odd number\n", num);
        }
    }
}
