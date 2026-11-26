package Inheritance;
public class hybridinherit {
    public static void main(String[] args){
        Animal a1 = new Animal();
        Tuna a2 = new Tuna();
        a2.lifespan(102);
        System.out.println(a2.lifespan);
        a2.eat();
        a2.color = "grey";
        System.out.println(a2.color);
        

    }
    
}

class Animal{
    String color;
    int lifespan;
    void eat(){
        System.out.println("its eates food");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("its swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("its flies");
    }
}
class Mammel extends Animal{
    void walk(){
        System.out.println("its walking");
    }
}
class Tuna extends Fish{
    void lifespan(int lifespan){
        this.lifespan = lifespan;
    }
}
class Shark extends Fish{
    void lifespan(int lifespan){
        this.lifespan = lifespan;
    }
   
}
class Peacock extends Bird{
    void lifespan(int lifespan){
        this.lifespan = lifespan;
    }

}
class Dog extends Mammel{
    void lifespan(int lifespan){
        this.lifespan = lifespan;
    }

}
class Cat extends Mammel{
    void lifespan(int lifespan){
        this.lifespan = lifespan;
    }

}
class Human extends Mammel{
    void lifespan(int lifespan){
        this.lifespan = lifespan;
    }


}