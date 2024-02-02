import java.util.Scanner;
public class lab2slide74 {
    public static void main(String[] args) {
        double sum = 0 ;
        int i, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu mang = ");
            n = sc.nextInt();
        } while (n < 0);
        Double so[]= new Double[n];
        for (i = 0; i < n; i++){
            System.out.print("Nhap vao phan tu thu " + i +" = " );
            so[i] = sc.nextDouble();
        }
        for ( i = 0 ; i < n; i++){
            if ( so[i] % 2 == 0 )
            sum = sum + so[i] ;
        }
        System.out.println("Tong cua cac so chan trong mang :" + sum);
    }
}
