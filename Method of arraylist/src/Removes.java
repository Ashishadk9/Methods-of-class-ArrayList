//Q3
import java.util.ArrayList;

public class Removes {
    public static void main(String[]args){
        // Create an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Before clear(): " + fruits);
        System.out.println("Size before clear(): " + fruits.size());

        // Remove all elements
        fruits.clear();

        System.out.println("After clear(): " + fruits);
        System.out.println("Size after clear(): " + fruits.size());
    }
}

