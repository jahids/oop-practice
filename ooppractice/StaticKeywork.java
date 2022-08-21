
package ooppractice;

class Test{
    String name;
    int roll;
    static String Universityname = "Bspi";
    
//    constructor
    Test(String n , int r){
    name = n;
    roll = r;
    }
    
    void show(){
    System.out.println("the name is " + name);
    System.out.println("the roll  is " + roll);
    System.out.println("the university is " + Universityname);
    
    
    }
    

}
public class StaticKeywork {
    public static void main(String[]args){
        
        Test detiles = new Test("jahid" , 44894);
        detiles.show();
    
    }
    
}
