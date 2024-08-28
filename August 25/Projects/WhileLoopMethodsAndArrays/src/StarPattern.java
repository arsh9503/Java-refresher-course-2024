import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numOfRows = scanner.nextInt();
        starPattern(numOfRows);
    }

    static void starPattern(int numOfRows){
        int rowCounter = 1;
        while(rowCounter<=numOfRows){
            int columnCounter = 1;
            while(columnCounter<=rowCounter){
                System.out.print("* ");
                columnCounter++;
            }
            System.out.println();
            rowCounter++;
        }
    }
}
