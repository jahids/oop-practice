
package ooppractice;
class VariableLength {

    void additionWithVarArg(int ... cloneNum){
        
//        define for each loop
int sum = 0;
for(int x : cloneNum){
sum+=x;
}
        
    System.out.println("this is full additon " + sum);
    
    }
    
}

public class varargsmethod {
    public static void main(String[]args){
        VariableLength vrgx = new VariableLength();
        vrgx.additionWithVarArg(5,10);
    }
}
