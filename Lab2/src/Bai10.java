import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        String kytu;
        int kq = -1, dem = 0;
        do{
            System.out.print("Nhap vao chuoi :");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
        System.out.print("Nhap vao ky tu can tim :");
        kytu = sc.nextLine();
        do{
            kq = chuoi.indexOf(kytu, kq + 1);
            if (kq >= 0)
            dem ++;
        } while (kq >= 0) ;
        System.out.println("So lan xuat hien cua ky tu la : " + dem); 
    }
}
