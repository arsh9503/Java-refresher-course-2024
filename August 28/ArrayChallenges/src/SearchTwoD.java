import java.util.Scanner;

public class SearchTwoD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to find: ");
        int num = scanner.nextInt();
        int[][] myArr = {{23,51,35},{64,69,92}};
        System.out.println(num + (search(myArr, num)?"": " doesn't") + " exist in the array");
    }

    static boolean search(int[][] arr, int target){
        int row = 0;
        while(row<arr.length){
            int column = 0;
            while(column<arr[row].length){
                if(arr[row][column] == target){
                    return true;
                }
                column++;
            }
            row++;
        }
        return false;
    }
}
