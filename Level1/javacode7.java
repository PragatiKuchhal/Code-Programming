//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class javacode7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        float length = sc.nextFloat();
        System.out.println("Please enter width of rectangle: ");
        float width = sc.nextFloat();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }
}