package polymorphism;

public class methodoverload {
    public static void main(){
    Calculator c1 = new Calculator();
    System.out.println(c1.sum(3 , 4));
    System.out.println(c1.sum(3.3f , 4.3f));
    System.out.println(c1.sum(3 , 5,4));
    }
}
class Calculator{
    int sum(int a , int b){
        return a  +  b;
    }
    float sum(float a , float b){
        return a + b;
    }
    int sum(int a ,int b, int c){
        return a + b + c;
    }
}