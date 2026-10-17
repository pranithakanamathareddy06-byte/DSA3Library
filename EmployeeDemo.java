class Employee{
    int EmpID;
    String EmpName;
    double Salary;
    void DisplayEmployeeInfo(){
        System.out.println("EmployeeID: " + EmpID );
         System.out.println("EmployeeName: " + EmpName );
          System.out.println("EmployeeSalary: " + Salary );

    }
}
public class EmployeeDemo{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.EmpID = 101;
        e1.EmpName = "pranitha";
        e1.Salary = 50000000.00;
        e1.DisplayEmployeeInfo();
     
    }
}