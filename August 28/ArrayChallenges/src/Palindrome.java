import java.util.Scanner;

public class Palindrome {
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
        System.out.println("The array is " + (checkIsPalindrome(arr)?"":"not ") + "palindrome");
    }

    static boolean checkIsPalindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
