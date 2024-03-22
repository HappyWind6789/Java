package Hinhhocs;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public Float Height;
    public HinhTru(){
        Name = "Hinh Tru";
    }
    public void EnterHeight(){
        EnterBankinh();
        Scanner sc =new Scanner(System.in);
        System.out.print("Height = ");
        Height = sc.nextFloat();
    }
    public void Tinhthetich(){
        Tinhdientich();
        Thetich = Dientich * Height ;
    }
}
