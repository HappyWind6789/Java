package Set;

import java.util.HashSet;
import java.util.Scanner;

public class lab4slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetStrings.add("w");
        hashSetStrings.add("R");
        hashSetStrings.add("T");
        hashSetStrings.add("C");
        System.out.println("Ptu trong mang");
        System.out.println(hashSetStrings);
        System.out.println("Nhap ptu can xoa:");
        name = sc.nextLine();
        if (hashSetStrings.contains(name)){
            hashSetStrings.remove(name);
            System.out.println("Xoa thanh cong ");
            System.out.println("Mang con lai");
            System.out.println(hashSetStrings);
        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }
}
