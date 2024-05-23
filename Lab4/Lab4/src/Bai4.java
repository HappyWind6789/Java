import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> hashSetsStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten trai cay can them : ");
        String Name = sc.nextLine();
        while (!Name.equals("done")) {
            if (!hashSetsStrings.contains(Name)){
                hashSetsStrings.add(Name);
                System.out.println("Them thanh cong");;
            } else {
                System.out.println("Ptu " + Name + " da ton tai");
            } 
            System.out.print("Nhap ten trai cay tiep theo can them (Nhap 'done' de dung) : ");
            Name = sc.nextLine();
        }
        System.out.println("Stop Add");
        System.out.println("\nTong so trai cay trong mang : " + hashSetsStrings.size());
        System.out.println("Cac loai trai cay trong mang: ");
        System.out.println(hashSetsStrings);
        System.out.print("Nhap loai trai cay can tim kiem (Nhap 'done' de dung) : ");
        String FindName = sc.nextLine();
        while (!FindName.equals("done")) {
            if (hashSetsStrings.contains(FindName)){
                System.out.println("Trai cay nay co trong mang : " + FindName);;
            } else {
                System.out.println("Trai cay " + FindName + " khong co trong mang");
            } 
            System.out.print("Nhap ten trai cay tiep theo can tim (Nhap 'done' de dung) : ");
            FindName = sc.nextLine();
        }
        System.out.println("Stop Find");
        Iterator<String> iterator = hashSetsStrings.iterator();
            int randomIndex = new Random().nextInt(hashSetsStrings.size());
            for (int i = 0; i < randomIndex; i++) {
                iterator.next();
            }
            String removedFruit = iterator.next();
            iterator.remove();
            System.out.println("Da xoa '" + removedFruit + "' khoi HashSet");
            System.out.println("Cac trai cay con lai khi xoa : ");
            System.out.println(hashSetsStrings);
        ArrayList<String> arrayListStrings = new ArrayList<>();
        arrayListStrings.add("xoai");
        arrayListStrings.add("mang cut");
        arrayListStrings.add("hong xiem");
        hashSetsStrings.addAll(arrayListStrings);
        System.out.println("\nHashSet sau khi them tu List:");
        Iterator<String> iterator2 = hashSetsStrings.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        hashSetsStrings.removeAll(arrayListStrings);
        System.out.println("HashSet sau khi xoa List : ");
        System.out.println(hashSetsStrings);
    }
}
