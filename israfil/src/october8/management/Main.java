package october8.management;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Sadik", 10000, "CSE", "EMP1231M");

        // manager.displayInfo();
        System.out.println("Department: " + manager.getDepartment());
        manager.setSalary(123456);
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Anuual Salary: " + manager.calculateAnnualSalary());
        manager.updateDepartment("CSE33");
        System.out.println("Department: " + manager.getDepartment());
        manager.increaseSalary(10);
        System.out.println("Salary: increased: " + manager.getSalary());

        manager.displayInfo();
    }
}
