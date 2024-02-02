import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n, aver, sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai day so :");
        n = sc.nextInt();
        int A[]= new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao so thu "+ i +" :");
            A[ i ] = sc.nextInt();
            sum = sum + A[i] ; 
        }
        aver = sum / n ;
        System.out.println("Trung binh cong cua cac so la : " + aver);
    }
}
