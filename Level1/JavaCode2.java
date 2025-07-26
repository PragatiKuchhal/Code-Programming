//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JavaCode2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print(num1 + " + " + num2 + " is: ");
        int sum = num1 + num2;
        System.out.println( sum);
    }
}