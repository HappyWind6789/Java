package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class lab4slide19 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();
        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(9.34f);
        Iterator<Float> iterator = arrayListFloat.iterator();
        System.out.println("Cac ptu co trong arrListFloat la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}
