class Employee1{
    int id;
    String name;
    double Salary;
    Employee1(int id,String name,double Salary ){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }
    void shownDetails(){
        System.out.println("id: " + id + ", name: " + name + ", salary: "  + Salary);
    }

}
public class EmployeeDemo1{
    public static void main(String[] args){
        Employee1 e1 = new Employee1(201,"amit",350000.0);
        Employee1 e2 = new Employee1(202,"ajay",200000.0);
        e1.shownDetails();
        e2.shownDetails();
    }
}