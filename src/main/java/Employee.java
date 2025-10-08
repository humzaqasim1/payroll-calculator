public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;

    public Employee(int id, String name, double hoursWorked, double hourlyRate){
        this.employeeId = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }
    public String getName(){
        return this.name;
    }
    public double calculateGrossPay(){
        double result = this.hoursWorked * this.hourlyRate;
        return result;
    }
}
