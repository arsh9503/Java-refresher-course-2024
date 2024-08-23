public class Main {
    public static void main(String[] args){
        //Type conversion and type casting
        float myFloat = 5; //integer assigned to float
        System.out.println(myFloat); //Compiler does the implicit conversion and prints 5.0;

        //Jug glass philosophy
        //Automatic --> Implicit Conversion --> Widening --> Chhote se bada --> Coercion
        //Manual --> Explicit Conversion --> Narrowing --> bade se chhota --> Casting --> Possibility of data loss

        int myInt = (int)5.7134; //Assigning double to integer, double is bigger than integer --> (int) will convert double to integer.
        System.out.println(myInt);
    }
}