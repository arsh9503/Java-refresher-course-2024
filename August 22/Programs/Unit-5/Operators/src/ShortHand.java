import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        //ShortHand Operators OR Augmented assignment operators
        int a = 5;
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        a += num1; //or a = a + num1;
        System.out.println(a);
        int num2 = scanner.nextInt();
        a += num2;
        System.out.println(a);
        int num3 = scanner.nextInt();
        a += num3;
        System.out.println(a);
        int num4 = scanner.nextInt();
        a += num4;
        System.out.println(a);

        //Applicable for all the arithmetic operators
    }
}
