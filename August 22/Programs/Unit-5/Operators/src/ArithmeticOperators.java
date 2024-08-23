public class ArithmeticOperators {
    public static void main(String[] args){
        //Addition
        int numOne = 8;
        int numTwo = 5;

        System.out.printf("The sum of %d and %d is %d\n", numOne, numTwo, numOne+numTwo);
        System.out.printf("The difference of %d and %d is %d\n", numOne, numTwo, numOne-numTwo);
        System.out.printf("The product of %d and %d is %d\n", numOne, numTwo, numOne*numTwo);
        System.out.printf("The quotient of %d divided by %d is %d\n", numOne, numTwo, numOne/numTwo); //Will implicitly cast it to int
        System.out.printf("The remainder of %d divided by %d is %d\n", numOne, numTwo, numOne%numTwo);

        double x = 5;
        double y = 2;
        System.out.println(x/y);
    }
}
