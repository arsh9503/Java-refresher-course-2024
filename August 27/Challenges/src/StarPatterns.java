import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(getPattern1(num));
        System.out.println(getPattern2(num));
        System.out.println(getPattern3(num));
    }

    static String getPattern1(int num){
        StringBuilder pattern  = new StringBuilder();
        int row = 1;
        while(row<=num){
            int column = 1;
            while(column<=row){
                pattern.append("* ");
                column++;
            }
            pattern.append("\n");
            row++;
        }
        return pattern.toString();
    }

    static String getPattern2(int num){
        StringBuilder pattern = new StringBuilder();
        int row = num;
        while(row>0){
            int column = 1;
            while(column<=row){
                pattern.append("* ");
                column++;
            }
            pattern.append("\n");
            row--;
        }
        return pattern.toString();
    }

    static String getPattern3(int num){
        StringBuilder pattern = new StringBuilder();
        int row = num;
        while(row>0){
            int column = 1;
            while(column<=num){
                if(column>=row){
                    pattern.append("* ");
                } else {
                    pattern.append("  ");
                }
                column++;
            }
            pattern.append("\n");
            row--;
        }
        return pattern.toString();
    }
}
