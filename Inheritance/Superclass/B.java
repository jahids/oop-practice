/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance.Superclass;

/**
 *
 * @author Jakir Uddin
 */
public class B extends A {
    
    int a = 2;
    int b = 4;
    
     B (){
                
    System.out.println("this a B constractor method");
    }
    
    void func(){
    super.func();
        System.out.println("the a" + a);
        System.out.println("the b" + b);
        
    }
    
    
    
}
