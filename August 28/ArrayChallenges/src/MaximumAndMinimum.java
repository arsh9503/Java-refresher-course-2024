import java.util.Scanner;

public class MaximumAndMinimum {
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
        System.out.println("The maximum element in the array is " + getMax(arr));
        System.out.println("The minimum element in the array is  " + getMin(arr));
    }

    static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(count<arr.length){
            if(arr[count]>max){
                max = arr[count];
            }
            count++;
        }
        return max;
    }

    static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int count = 0;
        while(count<arr.length){
            if(arr[count]<min){
                min = arr[count];
            }
            count++;
        }
        return min;
    }
}
