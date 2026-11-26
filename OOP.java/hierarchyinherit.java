public class hierarchyinherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        
    }
    
}
class Animal{
    String color;
    int legs;
    void eat(){
        System.out.println("eats");
    }                                               //hierarchy level in heritance
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("its swimming");
    }
}
class Dog extends Animal{
    
    void walk(){
        System.out.println("its walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("its flying");
    }
}