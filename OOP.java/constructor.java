public class constructor{
    public static void main(String args[]){
        Student s1 = new Student("Nishu");
        System.out.println(s1.name);

    }
}
class Student{
    String name;
    int USN;
    Student(String name){
        this.name = name;
    }
}