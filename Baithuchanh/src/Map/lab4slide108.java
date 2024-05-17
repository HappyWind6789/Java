package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class lab4slide108 {
    public static void main(String[] args) {
        TreeMap<Integer,Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(2, 10.1d);
        treeMap.put(3, 7.2d);
        treeMap.put(4, 20.28d);
        System.out.println("DS");
        Set<Map.Entry<Integer,Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
        treeMap.replace(4, 20.11d);
        treeMap.replace(2,7.2d,7.7d);
        System.out.println("Ds after");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

    }
}
