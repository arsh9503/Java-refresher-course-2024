public class Challenge1 {
    public static void main(String[] args){
        //Create a program to swap two numbers;
        int numOne = 10;
        int numTwo = 12;
        int temp = numTwo; //Storing the value of numTwo into a temporary variable
        numTwo = numOne;
        numOne = temp;
        System.out.println(numOne);
        System.out.println(numTwo);
    }
}
