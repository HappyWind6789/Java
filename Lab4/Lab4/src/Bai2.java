import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListIntegers  = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.print("Nhap gia tri cho phan tu thu " + i + " : ");
            int Number = sc.nextInt();
            linkedListIntegers.add(Number);
        }
        int Sum = 0;
        int dem = 0;
        Float Average = 0f;
        for(int i : linkedListIntegers){
            if (i % 2 == 0) {
                Sum = Sum + i ;
                dem ++;
            }
        }
        Average = (float) Sum/dem;
        System.out.println("Trung binh cong cua cac so chan trong list : " + linkedListIntegers + "\nla : " + Average);
    }
}
