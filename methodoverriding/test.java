/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding;


 
public class test extends person {
    String qualification;
    
    @Override
   void pack(){
        
    System.out.println("name is" + name);
    
    System.out.println("city is" + city);
    System.out.println("qualificatin is " + qualification );
    
    }
    
}
