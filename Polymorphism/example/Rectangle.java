/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism.example;



public class Rectangle extends Shape {
    
    double height ;
    double width;
    
    Rectangle(double height, double width){
            this.height = height;
            this.width = width;
    }
    
      double area(){
       
        double Ans = height * width;
        System.out.println("the rectangle is " + Ans);
        return 0;
        
    }
    
}
