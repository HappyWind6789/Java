package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class lab4slide87 {
    public static void main(String[] args) {
        HashMap<String , String> hashMap = new HashMap<>();
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++" );
        hashMap.put("PHP", "PHP");
    Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
    System.out.println("Cac entry co trong setHashMap: ");
    System.out.println(setHashMap);
    }
}
