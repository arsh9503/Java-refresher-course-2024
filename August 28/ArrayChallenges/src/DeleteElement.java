import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;
        while(count<arr.length){
            System.out.print("Enter the element no. " + (int)(count+1) + ": ");
            arr[count] = scanner.nextInt();
            count++;
        };
        System.out.print("Enter the number you want to delete: ");
        int num = scanner.nextInt();
        System.out.println("The array after deleting " + num + " is " + Arrays.toString(deleteElement(arr, num)));

    }

    static int[] deleteElement(int[] arr, int target){
        int[] resultantArr = new int[arr.length-1];
        int currentIndex = 0;
        int count = 0;
        while(count<arr.length){
            if(arr[count]!=target) {
                resultantArr[currentIndex] = arr[count];
                currentIndex++;
            }
            count++;
        }
        return resultantArr;
    }
}
