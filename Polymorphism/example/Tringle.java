
package Polymorphism.example;


public class Tringle extends Shape {
  
    double height ;
    double width;
    
    Tringle(double x , double y){
        
    height = x;
    width  = y;
    
    }
    
    
    @Override
    double area(){
       
        double Ans = (height * width)/2;
      
        return Ans;
        
    }
    
}
