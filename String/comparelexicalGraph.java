package String;

public class comparelexicalGraph {
    public static void main(String args[]){
        String fruits[] = {"banana","apple","grapes"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];

            }
            
        }
        System.out.print(largest);                  //compare letter tco(m*x)
    }
    
}
