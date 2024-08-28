public class SumAndAverageArray {
    public static void main(String[] args){
        int[][] arr = {{23,45,72}, {81,94,20}, {41,95,86}};
        System.out.println("The sum of the array elements is " + getSum(arr));
        System.out.println("The average of the array elements is " + getAverage(arr));
    }

    static int getSum(int[][] arr){
        int sum = 0;
        int row = 0;
        while(row<arr.length){
            int column = 0;
            while (column<arr[row].length){
                sum+=arr[row][column];
                column++;
            }
            row++;
        }
        return sum;
    }

    static int getAverage(int[][] arr){
        int totalElements = arr.length * arr[0].length;
        return getSum(arr)/totalElements;
    }
}
