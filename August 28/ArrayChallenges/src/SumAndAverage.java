import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int counter = 0;
        while(counter<arr.length){
            System.out.print("Enter element no. " + (int)(counter+1) + ": ");
            arr[counter] = scanner.nextInt();
            counter++;
        }

        System.out.println("The sum of the array elements is " + getSum(arr));
        System.out.println("The average of all the array elements is " + getAverage(arr));
    }

    static int getSum(int[] arr){
        int sum = 0;
        int count = 0;
        while(count<arr.length){
            sum+=arr[count];
            count++;
        }
        return sum;
    }

    static int getAverage(int[] arr){
        return getSum(arr)/arr.length;
    }
}
