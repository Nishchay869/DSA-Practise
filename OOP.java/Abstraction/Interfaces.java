package Abstraction;

public class Interfaces {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eat();

    }
    
}
interface Carnivore{
    public void eat();

}
interface Herbivore{
    public void eat();
}
class Bear implements Carnivore,Herbivore{
    public void eat(){
        System.out.println("eats both veg and non veg");
    }
}