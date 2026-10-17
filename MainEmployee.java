class Employee{
    int Empid;
    String Empname;
    double basicSalary;
Employee(int id,String name,double salary){
     Empid = id;
        Empname = name;
        basicSalary = salary;
    }
    double calculategrossSalary(){
        double hra = 0.20 * basicSalary;  // 20% of basic
        double da = 0.40 * basicSalary;   // 40% of basic
        double gross = basicSalary + hra + da;
        return gross;
    }
    void displayDetails(){
         double grossSalary = calculategrossSalary();
        System.out.println("Employeeid: " + Empid);
        System.out.println("Employeename: " + Empname);
        System.out.println("Employeebasicsalary: " + basicSalary);
        System.out.println("Gross salary: " + grossSalary);
    }
    }
    public class MainEmployee{
        public static void main(String[] args){
            Employee e1 = new Employee(101,"pranitha",1000000);
            Employee e2 = new Employee(102,"sunny",20000);
            Employee e3 = new Employee(103,"harika",30000);
            e1.displayDetails();
            e2.displayDetails();
            e3.displayDetails();
        }
    }


