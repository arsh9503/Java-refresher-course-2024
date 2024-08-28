import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        /*
        DRY: Don't repeat yourself
        Naming convention: camelCase
        Example: Function to add two numbers, Function to print n numbers, Function to search for a specific number from a array
        Real-life example: Beta gas band karke aao

        access-modifier return-type function-identifier(parameters){  --> Method signature
            body of the function --> Code to be executed
            return the return-type variable --> No need to have this if the return-type is void
         }

         example: Function to add two numbers

         public int addTwoNumbers(int a, int b){
               return a + b;
         }

         print(addTwoNumbers(1,2)) --> print 3 to the console/terminal

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scanner.nextLine();

        //If the function is not static
        //Functions user = new Functions();
        //System.out.println(user.greetUser(username));

        //System.out.println("Hello from the main");
        System.out.println(greetUser(username));
        //System.out.println("Method calling complete");

        //Whatever we pass while calling/invoking the function are called arguments
        //Whatever we pass in the function signature are called parameters
    }

    public static String greetUser(String name){ //A static function cannot access a not-static function
        //System.out.println("Hello from the method");
        return "Good Morning " + name;
    }

    //void -- mai vaapis laakar kuchh ni deta
    //For example: Mummy ne bola cup lekar jaa (parameter) kitchen mei rakh aa
    //Kaam to ho gya lekin lekar kuchh ni aaya mai


}
