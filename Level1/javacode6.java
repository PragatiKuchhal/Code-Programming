//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class javacode6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Principal: ");
        double P = sc.nextDouble();
        System.out.println("Please enter Rate of Interest: ");
        double R = sc.nextDouble();
        System.out.println("Please enter Time period: ");
        int T = sc.nextInt();
        double SI = (P * R * T) / 100;
        System.out.println("The Simple Interest is: " + SI);
    }
}