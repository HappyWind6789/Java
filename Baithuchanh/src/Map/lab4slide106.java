package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class lab4slide106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        Set<Map.Entry<Integer,Character>> setTreeMap = treeMap.entrySet();
        System.out.println("DS");
        System.out.println(setTreeMap);
    }
}
