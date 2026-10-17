class Employee {
    int empId;
    String name;
    double salary;

    Employee(int id, String n, double sal) {
        empId = id;
        name = n;
        salary = sal;
    }

    double calculateNetSalary() {
        double deduction = salary * 0.10;
        double netSalary = salary - deduction;
        return netSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class PayRollSystem {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "Pranitha", 30000);
        e1.displayDetails();
    }
}
