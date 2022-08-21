
package ArrayList;
import java.util.ArrayList;

public class arclas {
    public static void main(String[]args){
ArrayList<Integer>number = new ArrayList<Integer>();
     System.out.println("size + " + number.size());
     
     number.add(10);
     number.add(20);
     number.add(50);
     number.add(90);
     
//     number.remove(1);
     
        System.out.println("size + " + number.size());
//        boolean check = number.isEmpty();
boolean check = number.contains(50);
int index = number.indexOf(50);
System.out.println("index 50 " + index);
System.out.println("40 its  " + check);
        
//          System.out.println("size + " + check);
          
//        number.clear();
//replace 
number.set(0,70);
System.out.printf("size + " + number);
//number get ()
int m = number.get(2);
System.out.printf("get()" + m);



        if(number.isEmpty() == false){
           for(int x : number ){
        System.out.println("size + " + x);
        }
        }else{
        System.out.println("size + no  "  );
        }
        
     
     
    }
    
}
