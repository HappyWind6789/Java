import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, tong, hieu, tich, thuong, du;
        System.out.print("Nhap a = "); 
        a = sc.nextDouble();
        System.out.print("Nhap b = "); 
        b = sc.nextDouble();
        tong = a + b ;
        System.out.println("Tong cua 2 so la :" + tong);
        if (a > b ) {
            System.out.println(a + " lon hon " + b);
            hieu = a - b ;
        } else if (a < b) {
            System.out.println(b + " lon hon " + a);
            hieu = a - b ;
        } else {
            System.out.println(a + " bang " + b);
            hieu = a - b ;
        }
        System.out.println("Hieu cua 2 so la :" + hieu);
        tich = a * b ;
        System.out.println("Tich cua 2 so la :" + tich);
        if (b != 0) {
            thuong = a / b;
            du = a % b ;
            System.out.println("Thuong cua 2 so la :" + thuong);
            System.out.println("Du cua 2 so la :" + du);
        }
    }
}
