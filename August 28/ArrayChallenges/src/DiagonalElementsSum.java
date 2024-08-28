public class DiagonalElementsSum {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
        System.out.println("the sum of diagonal elements is " + getDiagonalSum(arr));
    }

    static int getDiagonalSum(int[][] arr){
        int sum = 0;
        int count = 0;
        while(count<arr.length){
            sum+=arr[count][count];
            count++;
        }
        return sum;
    }
}
