package Abstraction;

public class abstractt {
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
        c.changeColor();
        c.walk();
        Duck d = new Duck();
        d.eat();
        d.walk();  
        System.out.println(d.color);
        d.changeColor();
    }
    
}
abstract class Animal{
    String color;                                       //constrctor
    Animal(){
    color = "Brown";
    }
    void eat(){
        System.out.println("This animal eats the food");
    }
    abstract void walk();
}
class Cat extends Animal{
    void changeColor(){
        color="Dark brown";
        System.out.println(color);
    }
    void walk(){
        System.out.println("Walks on 4legs");
    }
}
class Duck extends Animal{
    void changeColor(){
        color="Dark yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
