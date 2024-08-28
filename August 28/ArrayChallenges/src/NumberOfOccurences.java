import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int counter = 0;
        while(counter<arr.length){
            System.out.print("Enter the element no. " + (int)(counter+1) + ": ");
            arr[counter] = scanner.nextInt();
            counter++;
        }
        System.out.print("Enter the element whose occurrence you want to check: ");
        int num = scanner.nextInt();
        System.out.printf("%d appears %d times in the array.\n", num, getOccurrence(arr, num));
    }

    static int getOccurrence(int[] arr, int target){
        int occurrences = 0;
        int count = 0;
        while(count<arr.length){
            if(arr[count]==target){
                occurrences++;
            }
            count++;
        }
        return occurrences;
    }
}
