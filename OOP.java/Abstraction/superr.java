package Abstraction;

public class superr {
    public static void main(String[] args){
        Horse h = new Horse();
        System.out.println(h.color);
    }   
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
}
class Horse extends Animal{
    
    Horse(){
        super.color = "Red";                                    //else by deualt it take super keyword so it prints constructor from parent class
        System.out.println("Horse constructor is called");
    }
}
