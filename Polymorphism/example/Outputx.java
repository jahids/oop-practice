/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism.example;

public class Outputx {
    public static void main(String[]args){
        
        Shape m = new Shape(); 
        m.area();
        
         m = new Tringle(10,20); 
          System.out.println("the tringle is " + m.area());
        
        m = new Rectangle(10 ,  20); 
        m.area();
        
        
    }
    
}
