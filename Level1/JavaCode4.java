//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JavaCode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = sc.nextDouble();
        double area = (3.14) * (radius * radius);
        System.out.println("The area is: " + area);
    }
}