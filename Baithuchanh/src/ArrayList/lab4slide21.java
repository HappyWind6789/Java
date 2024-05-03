package ArrayList;

import java.util.ArrayList;

public class lab4slide21 {
    public static void main(String[] args) {
        ArrayList<String> typecar = new ArrayList<>();
        typecar.add("Taxi");
        typecar.add("bus");
        typecar.add("bike");
        typecar.add("motobike");
        typecar.remove("Taxi");
        System.out.println(typecar.get(0));
        System.out.println(typecar.size());
        System.out.println(typecar.contains("bike"));
    }
}
