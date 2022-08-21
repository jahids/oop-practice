
package ooppractice;
//overloading constructor
public class Teacher {
    String name;
    int id;
    
//    no peamitar constructor
    Teacher(){
    System.out.println("no peramitar in different file");
    }
    
    //     peamitar constructor
    Teacher(String n, int i){
        name = n;
        id = i;
    System.out.println("Teacher name is " +name + " " + "roll is " + id);
    }
    
    
      //     overloading constructor
    Teacher(String n){
        name = n;
        
    System.out.println("Teacher name is " +name);
    }
    
    
}
