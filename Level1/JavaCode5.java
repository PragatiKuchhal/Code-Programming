//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JavaCode5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println("Please enter the height: ");
        double height = sc.nextDouble();
        double volume = (3.14) * (radius * radius) * height;
        System.out.println("The volume of a cylinder is: " + volume);
    }
}