import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] mergedArray = getMergedArray(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    static int[] getMergedArray(int[] arrOne, int[] arrTwo){
        int[] mergedArray = new int[arrOne.length+arrTwo.length];
        int count = 0;
        while(count<mergedArray.length){
            if(count<arrOne.length){
                mergedArray[count] = arrOne[count];
                System.out.println(Arrays.toString(mergedArray));
            } else {
                mergedArray[count] = arrTwo[count%arrTwo.length];
                System.out.println(Arrays.toString(mergedArray));
            }
            count++;
        }
        return mergedArray;
    }
}
