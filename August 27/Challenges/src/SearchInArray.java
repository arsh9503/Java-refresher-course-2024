import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
        System.out.print("Enter a number: ");
        int target = scanner.nextInt();
        System.out.println(target + (searchElement(arr, target)?" exists":" doesn't exist") + " in the array");

    }

    static boolean searchElement(int[] arr, int target){
        int count = 0;
        while(count<arr.length){
            if(arr[count]==target){
                return true;
            }
            count++;
        }
        return false;
    }
}
