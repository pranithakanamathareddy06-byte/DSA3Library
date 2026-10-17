class Student {
    int id;
    String name;
    String dept;
    double cgpa;
}
public class StudentSearch {

    public static void main(String[] args) {

    
        Student[] s = new Student[3];

    
        s[0] = new Student();
        s[0].id = 101;
        s[0].name = "Aravindan";
        s[0].dept = "BioTech";
        s[0].cgpa = 9.0;

    
        s[1] = new Student();
        s[1].id = 102;
        s[1].name = "Yashaswini";
        s[1].dept = "CS";
        s[1].cgpa = 8.5;

        
        s[2] = new Student();
        s[2].id = 103;
        s[2].name = "Adithi";
        s[2].dept = "BioTech";
        s[2].cgpa = 8.8;

        int searchId = 103;

        long start = System.nanoTime();  
        for (int i = 0; i < s.length; i++) {
            if (s[i].id == searchId) {
                System.out.println("Student Found");
                System.out.println(
                        s[i].id + " | " +
                        s[i].name + " | " +
                        s[i].dept + " | " +
                        s[i].cgpa
                );
                break;
            }
        }

        long end = System.nanoTime();   

        System.out.println("Time taken: " +
                (end - start) / 1_000_000.0 + " ms");
    }
}
