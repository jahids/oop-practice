/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding;


public class Output {
    public static void main(String[]args){
    
    test t1 = new test();
    t1.name ="mabud";
    t1.city ="chittagong";
    t1.qualification ="broker";
  
    t1.pack();
    
//    override method call
 test t2 = new test();
    t2.name ="nursafa";
    t2.city ="dhaka";
    
    t2.pack();

    
    }
}
