import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistwhile {
    public static void main(String[]args){
        ArrayList<String>arrayList= new ArrayList<>();
        arrayList.add("Hari");
        arrayList.add("Kc");
        arrayList.add("Have nice day");
        System.out.println(arrayList);
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s:arrayList){
            System.out.println(s);
        }
    }
}
