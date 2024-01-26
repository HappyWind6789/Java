import java.util.Scanner;

public class lab2slide30 {
    public static void main(String[] args) {
        long n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = sc.nextLong();
            if (n < 10 && n > 0) {
                sum = sum + n ;
            } else {
                for (int i=1; i<=n; i++){
                sum = sum + n%10 ;
                n = n/10 ;
            }
        }
         System.out.print("tong la :"+ sum);
    }
}
