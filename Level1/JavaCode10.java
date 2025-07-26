//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JavaCode10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}