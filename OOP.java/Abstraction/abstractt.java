package Abstraction;

public class abstractt {
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
        c.walk();
        Duck d = new Duck();
        d.eat();
        d.walk();  
    }
    
}
abstract class Animal{
    void eat(){
        System.out.println("This animal eats the food");
    }
    abstract void walk();
}
class Cat extends Animal{
    void walk(){
        System.out.println("Walks on 4legs");
    }
}
class Duck extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
