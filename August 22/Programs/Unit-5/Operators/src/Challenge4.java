import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        System.out.printf("The area of the rectangle with height %d and breadth %d is %d sq.units\n", height, breadth, height*breadth);

    }
}
