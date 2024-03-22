package Hinhhocs;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public Float Bankinh;
    public HinhTron(){
        Name = "Hinh Tron" ;
    }
    public void EnterBankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh = ");
        Bankinh = sc.nextFloat();
    }
    public void Tinhchuvi(){
        Chuvi = 2 * PI * Bankinh ;
    }
    public void Tinhdientich(){
        Dientich = PI * Bankinh * Bankinh ;
    }
}
