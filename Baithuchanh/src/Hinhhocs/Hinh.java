package Hinhhocs;

public class Hinh {
    public static void main(String[] args) {
        HinhTron htron = new HinhTron();
        htron.DisplayName();
        htron.EnterBankinh();
        htron.Tinhchuvi();
        htron.Tinhdientich();
        htron.DisplayChuvi();
        htron.DisplayDientich();
        HinhTru htru = new HinhTru();
        htru.DisplayName();
        htru.EnterHeight();
        htru.Tinhthetich();
        htru.DisplayThetich();
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.DisplayName();
        hcn.EnterDai();
        hcn.EnterRong();
        hcn.Tinhchuvi();
        hcn.Tinhdientich();
        hcn.DisplayChuvi();
        hcn.DisplayDientich();
        HinhVuong hv = new HinhVuong();
        hv.DisplayName();
        hv.EnterCanh();
        hv.Tinhchuvi();
        hv.Tinhdientich();
        hv.DisplayChuvi();
        hv.DisplayDientich();
    }
    
}
