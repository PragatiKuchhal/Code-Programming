//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JavaCode3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("The temperature in faherenheit is: ");
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.print( fahrenheit);
    }
}