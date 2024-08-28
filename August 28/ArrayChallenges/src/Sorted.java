import java.util.Scanner;

public class Sorted {
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
        }
        System.out.println("The array is " + (checkIsSorted(arr)?"":"not ") + "sorted");
    }

    static boolean checkIsSorted(int[] arr){
        if(arr.length == 1) return true;
        return arr[0]<arr[1];
    }
}
