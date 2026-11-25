public class copyconstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "nishu";
        s1.USN = 123;
        s1.pwd = "eeew";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 99;
      
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        s2.marks[2] = 4;
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }
        
    }
}
class Student{
    String name;
    int USN;
    String pwd;
    int marks[] = new int[3];
    Student(Student s1){   //parametrized
        this.name = s1.name;
        this.USN = s1.USN;
        this.pwd = s1.pwd;
        this.marks = s1.marks;
        
    }
    Student(){
        System.out.println("object created ...");         //non parametrized
    }
}