import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number determiner program");

        System.out.print("Enter a positive or negative number: ");
        int num = scanner.nextInt();

        if(num==0){
            System.out.println("The number is zero");
        } else if (num>0){
            System.out.println("The number is a positive integer");
        } else {
            System.out.println("The number is a negative integer");
        }
    }
}
