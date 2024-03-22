package Hinhhocs;

import java.util.Scanner;


public class HinhChuNhat extends HinhHoc {
    public Float Dai;
    public Float Rong;
    public HinhChuNhat(){
        Name = "Hinh Chu Nhat";
    }
    public void EnterDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai = ");
        Dai = sc.nextFloat();
    }
    public void EnterRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu rong = ");
        Rong = sc.nextFloat() ;
    }
    public void Tinhchuvi(){
        Chuvi = ( Dai + Rong ) / 2;
    }
    public void Tinhdientich(){
        Dientich = Dai * Rong ;
    }
}
