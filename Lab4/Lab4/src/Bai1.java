import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListiIntegers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.print("Nhap gia tri cho phan tu thu " + i + " : ");
            int Number = sc.nextInt();
            arrayListiIntegers.add(Number);
        }
        int Max = arrayListiIntegers.getFirst();
        for(int i = 0 ; i < arrayListiIntegers.size() ; i++){
            if (arrayListiIntegers.get(i).compareTo(Max) > 0) {
                Max = arrayListiIntegers.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong day la : " + Max);
        ArrayList<Integer> arrayListRemove = new ArrayList<>();
        System.out.print("Nhap gia tri muon xoa : ");
        int Remove = sc.nextInt();
        arrayListRemove.add(Remove);
        System.out.println("List ban dau : " + arrayListiIntegers);
        arrayListiIntegers.removeAll(arrayListRemove);
        System.out.println("List sau xoa : " + arrayListiIntegers);
        arrayListiIntegers.sort(Comparator.naturalOrder());
        System.out.println("List sau khi sap xep : " + arrayListiIntegers);
    }
}
