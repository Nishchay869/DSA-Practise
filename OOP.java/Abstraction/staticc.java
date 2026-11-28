package Abstraction;

public class staticc {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setName("Nishu");
        s1.SchoolName = "MSEC";
        Student s2 = new Student();
        s2.SchoolName = "MDRS";
        System.out.println(s1.SchoolName);
    }
    
}
class Student{
    String Name;                                    
    int Rolllno;
    static String SchoolName;                       //by using static keyword it reflect same in all object we called once memory created latest value stores in it and all points toward the same point
    void setName(String name){
        this.Name = name;
    }

}