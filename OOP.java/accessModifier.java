// package OOP.java;

public class accessModifier {
    public static void main(String args[]){
        Bankaccount act = new Bankaccount();
        act.username = "nishu";
        System.out.println(act.username);
        act.setPassword("gfagfag");

    }
    
}

class Bankaccount{
    public String username;
    private String password;
    void setPassword(String newpwd){
        password = newpwd;
    }
}