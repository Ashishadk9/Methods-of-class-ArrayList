//Q2
import java.util.ArrayList;
public class Adds {
   public static  void main(String[]args){
       ArrayList<String>fruits = new ArrayList<>();
       // Add elements to the end f the list
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");
       System.out.println("Original list"+ fruits);
       //add "Mango" at position 1
       fruits.add(1,"Mango");
       System.out.println("After adding at Position 1:"+ fruits);
   }
}
