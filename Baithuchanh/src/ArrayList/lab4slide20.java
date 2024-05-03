package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class lab4slide20 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();
        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('d');
        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.println("ptu la: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
        }
}
