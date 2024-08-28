import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;
        while(count<arr.length){
            System.out.print("Enter the element at position " + (int)(count+1) + ": ");
            arr[count] = scanner.nextInt();
            count++;
        }
        reverseArray(arr);
        System.out.println("The reversed array is " + Arrays.toString(arr));
    }

    static void reverseArray(int[] arr){
        int[] resultantArr = new int[arr.length];
        int count = 0;
        while(count<arr.length){
            resultantArr[(resultantArr.length-count)-1] = arr[count];
            count++;
        }
        count = 0;
        while(count<arr.length){
            arr[count] = resultantArr[count];
            count++;
        }
    }
}
