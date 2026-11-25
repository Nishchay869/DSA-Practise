// package OOP.java;

public class classandobject {
    public static void main(String args[]){
        Pen P1 = new Pen();
        P1.setColor("Yellow");
        System.out.println(P1.color);
        P1.color = "Red";
        System.out.println(P1.color);
        P1.setTip(5);
        System.out.println(P1.tip);
        Student S1 = new Student();
        S1.percentage(4,5,3);
        System.out.println(S1.percentage);


    } 
    
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void percentage(int chem,int mat,int sci){
        percentage = (chem+mat+sci)/3;
    }
}
