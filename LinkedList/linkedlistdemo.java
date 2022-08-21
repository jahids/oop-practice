
package LinkedList;

import java.util.LinkedList;
public class linkedlistdemo {
    public static void main(String[]args){
    
        LinkedList<String> CountryName = new LinkedList<String>();
        
        CountryName.add("bangladesh");
         CountryName.add("b");
          CountryName.add("desh");
          CountryName.add("india");
          CountryName.addFirst("aus");
          CountryName.removeLast();
          System.out.println("getfirst " + CountryName.getFirst());
          System.out.print("getlast " + CountryName.getLast());
          
          
          for(String x : CountryName){
          System.out.println(x);
          }
          
          CountryName.clear();
          System.out.print("total linked list " + CountryName);
          
          
          
    }
}
