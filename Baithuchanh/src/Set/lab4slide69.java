package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class lab4slide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetIntegers.add(0);
        treeSetIntegers.add(8);
        treeSetIntegers.add(5);
        System.out.println("Cac ptu trong mang: ");
        System.out.println(treeSetIntegers);
        System.out.print("Nhap ptu can them: ");
        number = sc.nextInt();
        if (!treeSetIntegers.contains(number)){
            treeSetIntegers.add(number);
            System.out.println("Them thanh cong");;
            System.out.println("Cac ptu trong mang: ");
            System.out.println(treeSetIntegers);
        } else {
            System.out.println("Ptu " + number + " da ton tai");
        }
    }
}
