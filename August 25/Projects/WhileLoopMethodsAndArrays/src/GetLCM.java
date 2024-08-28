import java.util.Scanner;

public class GetLCM {
    public static void main(String[] args){
       int numOne = getInput("Enter the first number");
       int numTwo = getInput("Enter the second number");
        System.out.printf("The LCM of %d and %d is %d", numOne, numTwo, getLCM(numOne, numTwo));
    }

    static int getLCM(int numOne, int numTwo){
        if(numOne == 0 || numTwo == 0){
            return -1;
        }
        int lcm = 1;
        int count = 2;
        int greaterNumber = Math.max(numOne, numTwo);
        while(count<=greaterNumber){

            if(numOne%count==0 || numTwo%count==0){
                if(numOne%count==0){
                    numOne/=count;
                }
                if(numTwo%count==0){
                    numTwo/=count;
                }
                lcm*=count;
            } else {
                count++;
            }

        }
        return lcm;
    }

    static int getInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}
