//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class javacode8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the base: ");
        int base = sc.nextInt();
        System.out.println("Please enter the exponent: ");
        int exponent = sc.nextInt();
        double power = Math.pow(base, exponent);
        System.out.println(base + " raise to the " + exponent + " is: " + power);
    }
}