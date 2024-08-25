import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in fahrenheit: ");
        float tempFahrenheit = scanner.nextFloat();

        System.out.printf("%.1f °F in celsius is %.1f °C\n", tempFahrenheit, (tempFahrenheit-32)*5/9);
    }
}
