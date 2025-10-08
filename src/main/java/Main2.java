import java.io.*;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/main/resources/payroll.json");) {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String header = bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] sections = input.split("\\|");
                int id = Integer.parseInt(sections[0]);
                String name = sections[1];
                double hoursWorked = Double.parseDouble(sections[2]);
                double payRate = Double.parseDouble(sections[3]);
                Employee employee = new Employee(id, name, hoursWorked, payRate);
                System.out.println("Employee name: " + employee.getName() + " Employee gross pay: " + employee.calculateGrossPay());
                writer.write("Employee name: " + employee.getName() + " Employee gross pay: " + employee.calculateGrossPay() + "\n");
            }
//            System.out.print("Employee: %s \n Gross pay: %f", sections[1], employee.calculateGrossPay());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IO problem: " + e);
        }


//        while ((input = bufferedReader.readLine()) != null) {
//        }

    }
}
