class Student{
    int rollno;
    String name;
    // void insertRecord(int r,String n){
    // rollno = r;
    // name = n;
// }
    void displayInformation(){
        System.out.println(rollno + " " + name);
     }
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.rollno = 12;
        s1.name = "prani";
        s2.rollno = 13;
        s2.name = "sunny";
        s1.displayInformation();
        s2.displayInformation();
    }
}