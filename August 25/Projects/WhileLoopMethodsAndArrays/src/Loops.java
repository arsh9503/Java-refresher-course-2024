import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

        /*
        Loop: Code that runs multiple times based on a condition
        Repeated execution of code.
        Loops automate repetitive tasks.
        Types of Loops: while, for, do-while
        Iterations: Number of times the loop runs
         */

        /*
        int a = 1; --> Initialization
        While(a<=10) { --> condition
            code to be executed based on the condition
            --> Example: print(a)
            a++; --> Increment/Decrement --> Always update the loop variable to avoid infinite loop
        }
         */

        //Loop to print 1 to 10
        int num = 1; //Initializing the loop variable

        while(num<=10){ //Condition
            System.out.println(num);
            num++; //Updating the loop variable
        }

        //Loop to print 500 to 200 in reverse
        int numDash = 500;
        while(numDash>=200){
            System.out.println(numDash);
            numDash--;
        }

        //Taking 5 user inputs one-by-one
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i<10){
            System.out.print("Enter the " + (int)(i+1) + ((i == 0) ? "st" : (i+1) == 2 ? "nd" : (i+1) == 3 ? "rd" : "th") + " number: ");
            int inputNum = scanner.nextInt();
            System.out.println(inputNum);
            i++;
        }
    }
}
