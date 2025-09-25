import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = myScanner.nextLine();

        System.out.println("Enter your hours worked: ");

        String input = myScanner.nextLine();

        double hoursWorked = Double.parseDouble(input);

        System.out.println("Enter your pay rate: ");

        input = myScanner.nextLine();

        double payRate = Double.parseDouble(input);

        System.out.println(name + "'s gross pay is " + (payRate * hoursWorked));
    }
}
