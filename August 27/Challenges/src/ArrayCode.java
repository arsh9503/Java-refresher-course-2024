import java.util.Arrays;

public class ArrayCode {
    public static void main(String[] args1){
        //data_type[] reference_name = new data_type[array_size];
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 15;
        myArray[2] = 17;
        myArray[3] = 20;
        myArray[4] = 25;
//        System.out.println(Arrays.toString(myArray));
        int count = 0;
        while(count<myArray.length){
            System.out.println(myArray[count]);
            count++;
        }
    }
}
