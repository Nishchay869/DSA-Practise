package Encapsulation;
// package OOP.java;

public class accessModifier {
    public static void main(String args[]){
        Bankaccount act = new Bankaccount();
        act.username = "nishu";
        System.out.println(act.username);
        act.setPassword("gfagfag");
        System.out.println(act.getpassword());

    }
    
}

class Bankaccount{
    public String username;
    private String password;
    String getpassword(){
        return this.password;
    }
    void setPassword(String newpwd){
        password = newpwd;
    }
}