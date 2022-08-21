/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

public class Outputpoly {
    public static void main(String[]args){
        
       ;
        
         personPoly pp = new personPoly();
        pp.display();
        
         pp = new StudentPoly();
        pp.display();
        
       pp = new TeacherPoly();
       
        pp.display();
        
        
    }
}
