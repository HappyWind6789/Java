import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String hoten;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten : ");
        hoten = sc.nextLine();
        System.out.print("nhap tuoi : ");
        tuoi = sc.nextInt();
        if (tuoi < 16)
        System.out.println("Ban "+ hoten + "o do tuoi vi thanh nien");
        else if ( tuoi >= 16 && tuoi < 18 )
        System.out.println("Ban "+ hoten + " o do tuoi truong thanh ");
        else System.out.println("Ban "+ hoten + " da gia ");
    }
}
