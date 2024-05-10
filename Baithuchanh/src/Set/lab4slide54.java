package Set;

import java.util.HashSet;
import java.util.Scanner;

public class lab4slide54 {
    public static void main(String[] args) {
        HashSet<Integer> hashSetiIntegers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetiIntegers.add(0);
        hashSetiIntegers.add(7);
        hashSetiIntegers.add(8);
        hashSetiIntegers.add(4);
        System.out.println("Cac ptu trong mang: ");
        System.out.println(hashSetiIntegers);
        System.out.print("Nhap ptu can them: ");
        int number = sc.nextInt();
        if (!hashSetiIntegers.contains(number)){
            hashSetiIntegers.add(number);
            System.out.println("Them thanh cong");;
            System.out.println("Cac ptu trong mang: ");
            System.out.println(hashSetiIntegers);
        } else {
            System.out.println("Ptu " + number + " da ton tai");
        }
    }
}
