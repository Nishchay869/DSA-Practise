package Encapsulation;
public class constructor{
    public static void main(String args[]){
        Student s1 = new Student("Nishu");
        System.out.println(s1.name);
        Student s2 = new Student();

    }
}
class Student{
    String name;
    int USN;
    Student(String name){   //parametrized
        this.name = name;
    }
    Student(){
        System.out.println("object created ...");         //non parametrized
    }
}