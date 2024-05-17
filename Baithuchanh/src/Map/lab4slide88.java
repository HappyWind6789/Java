package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class lab4slide88 {
    public static void main(String[] args) {
        HashMap<String,String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");
        hashMapCity.put("QN", "Quang Ninh");
        hashMapCity.put("HCM", "TP Ho Chi Minh");
        System.out.println("Ds trong hashMapCity");
        Set<Map.Entry<String,String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNg:" + hashMapCity.get("QNg"));
        System.out.println("NT:" + hashMapCity.get("NT"));
        if (hashMapCity.containsValue("TP Ho Chi Minh")) {
            System.out.println("Co TP Ho Chi Minh trong hashMapCity");
        }
    }
}
