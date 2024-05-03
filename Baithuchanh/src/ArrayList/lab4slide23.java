package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class lab4slide23 {
    public static void main(String[] args) {
        int number;
        int n;
        ArrayList<Integer> arrayListiIntegers = new ArrayList<>();
        System.out.print("Nhap so phan tu cau arrListInt: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.print("Nhap vap phan tu thu " + i + ":");
            number = sc.nextInt();
            arrayListiIntegers.add(number);
        }
        int max = arrayListiIntegers.get(0);
        for ( int i = 1 ; i < arrayListiIntegers.size() ; i++){
            if (arrayListiIntegers.get(i).compareTo(max) > 0){
                max = arrayListiIntegers.get(i);
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
    }
}
