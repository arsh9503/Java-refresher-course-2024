public class UnaryOperators {
    public static void main(String[] args) {
        //Unary Operators
        // Pre- and post-increment/decrement operators

        //Minus = -
        int x = 5;
        int y = -x; //Stores the negative value of x into y
        System.out.println(y);
        int z = -y;
        System.out.println(z); // Minus minus becomes positive

        //Pre-increment
        int a = 5;
        a = a + 1;
        System.out.println(a);

        //shorthand
        a+=1;
        System.out.println(a);
        a++; //Shorthand ka bhi shorthand --> this is post increment btw
        System.out.println(a);
        ++a; //Pre-increment --> increment the value by 1 first and then use in the statement
        System.out.println(a);

        //Taking another example
        int b = 10;
        System.out.println(b++); //Value of b is still the same
        System.out.println(b); //The value was incremented after printing

        int c = 20;
        System.out.println(++c); //Value of c was incremented before printing

    }
}
