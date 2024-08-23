public class Main {
    public static void main(String[] args) {
        int myNumber = 10; // declaration with initialization
        int yourNumber; //declaration
        yourNumber = 865;
        System.out.println(yourNumber);
        yourNumber = 45; // 45 is integer literal
        System.out.println(yourNumber);

        boolean isOld = false;
        System.out.println(isOld);

        float myFloat = 5.0f; //By default, it treats it as double use trailing f to ensure it is stored and treated as a float
        System.out.println(myFloat);

//        float newFloat = "Hello brother"; //it should have a float literal

        double myDouble = 6.3784239;
        System.out.println(myDouble);

        String wishes = "Good Morning Samandeep Singh"; //You need to use double quotes for string
        System.out.println(wishes);

        System.out.println(wishes.toUpperCase());

        // variable name is technically called identifer
        int $age = 12; //identifiers are case sensitive, and it cannot start with a number. should start with alphabet, dollar, or underscore
        System.out.println($age);

        //The values are called literal

        char myChoice = 'A'; //defined using single quotes
        System.out.println(myChoice);

        String option = ""; //string can be empty bruhh
        System.out.println(option);

        try {
            int[] myArr = {1,4,5,6,3};
            System.out.println(myArr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds: " + e.getMessage());
        }


    }
}