//Q4
import java.util.ArrayList;
public class Updated {
    public static void main(String[]args){
        // Create an Arraylist
        ArrayList<String>fruits= new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Original list:"+ fruits);
        // Remove elements at position
        String removedFruit=fruits.remove(1);
        System.out.println("Removed elements:"+removedFruit);
        System.out.println("Updateds list:"+fruits);
    }
}
