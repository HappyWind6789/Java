package Hinhhocs;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        Name = "Hinh Vuong";
    }
    public void EnterCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Canh = ");
        Dai = Rong = sc.nextFloat();
    }
}
