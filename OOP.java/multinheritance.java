public class multinheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.run();
        d1.setBreed("shitz");
        System.out.println(d1.breed);
        
    }
    
}
class Animal{
    String color;
    int legs;
    void eat(){
        System.out.println("eats");
    }                                               //multi level inheritance
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    int speed;
    void run(){
        System.out.println("its running");
    }
}
class Dog extends Mammal{
    String breed;
    void setBreed(String breed){
        this.breed = breed;


    }
}
