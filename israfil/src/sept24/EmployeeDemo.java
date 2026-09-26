package sept24;

class Employee {
    String name;
    int employeeId;
    double basicSalary;

    Employee(){
        this.name = " ";
        this.employeeId = 0;
        this.basicSalary = 0.0;
    }

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double allowance;

    FullTimeEmployee(){
        this.allowance = 0.0;
    }

    public FullTimeEmployee(String name, int employeeId, double basicSalary, double allowance) {
        super(name, employeeId, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int workingHours;

    PartTimeEmployee()
    {
        this.hourlyRate =0.0;
        this.workingHours -= 0;
    }

    public PartTimeEmployee(String name, int employeeId,double basicSalary,double hourlyRate,int workingHours) {
        super(name, employeeId, basicSalary);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workingHours;
    }
}

class EmployeeDemo {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Rahim", 101, 30000, 5000);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Karim", 102, 0, 500, 40);

        System.out.println("----- Full-Time Employee -----");
        fullTimeEmployee.displayEmployeeInfo();

        System.out.println();

        System.out.println("----- Part-Time Employee -----");
        partTimeEmployee.displayEmployeeInfo();
    }
}
