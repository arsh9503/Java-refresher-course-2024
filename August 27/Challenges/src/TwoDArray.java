import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args){
//        int[][] my2dArray = new int[3][3];
//        System.out.println(Arrays.deepToString(my2dArray));

        int[][] newArr = {{1,2,3}, {4,5,6}};
        int count = 0;
        while(count<newArr.length){
            int counter = 0;
            while(counter<newArr[count].length){
                System.out.println(newArr[count][counter]);
                counter++;
            }
            count++;
        }

    }
}
