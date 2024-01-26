import java.util.Scanner;

public class lab2slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0 ;
        while (sum < 100){
            System.out.print("Nhap so nguyen : ");
            n = sc.nextInt();
            sum = sum + n;
        }
        System.out.println("Tong cac so nguyen la :"+ sum);
    }
}
