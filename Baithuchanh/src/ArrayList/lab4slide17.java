package ArrayList;

import java.util.ArrayList;

public class lab4slide17 {
    public static void main(String[] args) {
        ArrayList<String> arrListSting = new ArrayList<>();
        arrListSting.add("Java");
        arrListSting.add("Php");
        arrListSting.add("C#");
        arrListSting.add("C++");
        System.out.println("Cac ptu co trong arrListString la: ");
        for (int i = 0 ; i < arrListSting.size() ; i++) {
            System.out.println(arrListSting.get(i) + "\t");
        }
    }
}
