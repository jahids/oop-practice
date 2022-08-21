
package ooppractice;
class TestingMethod{
    static int count = 0;
    int x = 10;
    static String jahid = "hello world";
    
    TestingMethod(){
        count++;
        System.out.println("total student is " + count + x);
    }
    
    
    static void display(){
      
            System.out.println("i am a static method"+ jahid);

    }
    
    
}
public class StaticMethod {
    public static void main(String[]args){
    
        TestingMethod test1 = new TestingMethod();
        TestingMethod test2 = new TestingMethod();
        TestingMethod test3 = new TestingMethod();
        TestingMethod test4 = new TestingMethod();
        
        
        TestingMethod.display();
        
    }
}
