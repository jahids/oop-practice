
package ooppractice;

class Callbyv{

    void change(int s){
     s = 100;
        System.out.println("new value x = s "+s);
    }
    
}


class callbyref{
String name;

    void mainchange(callbyref r2){
      r2.name = "jakirUddin";
    
    }
    
}

public class CallByValue {
    public static void main(String[]args){
     
        Callbyv obj = new Callbyv();
        int x = 10;
        obj.change(x);
        System.out.print(x);
        
        callbyref ref = new callbyref();
        
        ref.name = "jahid";
        System.out.println("call by ref pree"+ ref.name);
        ref.mainchange(ref);
         System.out.println("call by ref than pass"+ ref.name);
    }
}
