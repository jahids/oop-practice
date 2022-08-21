package ooppractice;
//own class
class pen{
String color;
String type;

//public void write(){
//System.out.println("your pen color is " + this.color );
//}

//constructor
pen(String c, String t){
    color = c;
    type = t;
    System.out.println("your pen color is " + color + "and type is " + type );
}

}

public class OOpPractice {
    public static void main(String[] args) {
        
//       pen pen1 = new pen();
//       pen1.color = "yello";
//       pen1.type = "gepen";
//       
//       pen1.write();
//       
//       pen pen2 = new pen();
//       pen2.color = "red";
//       pen2.type = "woodpen";
//       pen2.write();
//       
        pen pen1 = new pen("orange" , "gelpen");
       
    }
    
}
