package october8.company;

public class Employee {
    public String name;
    protected double salary;
    String department;
    private String employeeId;

    private Employee() {
        this.name = " ";
        this.salary = 0.0;
        this.department = " ";
        this.employeeId = " ";
    }

    public Employee(String name, double salary, String department, String employeeId) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public double calculateAnnualSalary() {
        return this.salary * 12;
    }

    public void increaseSalary(int percentage) {
        this.salary = this.salary + (this.salary * (percentage / 100));
    }

    public void updateDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.department);
        System.out.println("Department: " + this.department);
        System.out.println("Employee Id: " + this.employeeId);
    }
}
