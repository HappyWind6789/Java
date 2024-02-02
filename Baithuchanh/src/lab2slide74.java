import java.lang.reflect.Array;
import java.util.Scanner;

public class lab2slide74 {
    public static void main(String[] args) {
        int n,i, sum = 0 ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu mang = ");
            n = sc.nextInt();
        } while (n < 0);
        int so[]= new int[n];
        for (i = 0; i < n; i++){
            System.out.print("Nhap vao phan tu thu " + i +" = " );
            so[i] = sc.nextInt();
        }
        for ( i = 0 ; i < n; i++){
            if ( so[i] % 2 == 0 )
            sum = sum + so[i] ;
        }
        System.out.println("Tong cua cac so chan trong mang :" + sum);
    }
}
