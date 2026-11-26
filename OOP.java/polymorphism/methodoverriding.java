package polymorphism;

public class methodoverriding {
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bau");
    }
}