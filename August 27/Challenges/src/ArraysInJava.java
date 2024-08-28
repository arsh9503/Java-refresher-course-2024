import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();
        float[] students = new float[size];
        int count = 0;
        float sum = 0;
        while(count<students.length){
            System.out.print("Enter the marks for student " + (int)(count+1) + ": ");
            float marks = scanner.nextFloat();
            sum+=marks;
            students[count] = marks;
            count++;
        }
        System.out.println("The mark list is " + Arrays.toString(students));
        System.out.println("The average score is " + sum/students.length);

    }
}
