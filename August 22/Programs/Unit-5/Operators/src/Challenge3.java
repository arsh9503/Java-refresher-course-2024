import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        System.out.printf("The perimeter of rectangle with length %d and breadth %d is %d units\n", length, breadth, 2*(length+breadth));
    }
}
