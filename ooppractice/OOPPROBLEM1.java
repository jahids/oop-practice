
package ooppractice;

class Box{
    double height;
    double width;
    double depth;
    
//    declaring constructor
    Box(double h, double w, double d){
    height = h;
    width = w;
    depth = d;
    
    
    }
    
   void displayvol(){
       double vol = height * width * depth;
   System.out.println("the box ans is " + vol);
//   System.out.println("the width is " + width);
//   System.out.println("the depth is " + depth);
   }

}

public class OOPPROBLEM1 {
    
    
}
