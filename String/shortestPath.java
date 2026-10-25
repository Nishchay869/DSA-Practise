package String;
import java.util.*;

public class shortestPath {
    public static float getShortestPath(String str){
        int Y=0,X=0;
        for(int i =0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'N'){
                Y++;

            }
            else if(dir == 'S'){
                Y--;
            }
            else if(dir == 'E'){
                X++;
            }
            else{
                X--;
            }
        }
        int X2 = X*X;
        int Y2= Y*Y;
        return (float)(Math.sqrt(X2+Y2));
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
    
}
