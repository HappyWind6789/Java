import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        double a, b , x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = sc.nextDouble();
        System.out.print("Nhap b = ");
        b = sc.nextDouble();
        if (a == 0) {
            System.out.println("khong phai phuong trinh bac1");
        } else {
            x = -b / a ;
            System.out.println("phuong trinh co nghiem x = "+ x);
        }

    }
}
