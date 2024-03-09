import java.util.Scanner;

public class hinhtron {
    public float bankinh ;
    public float chuvi ;
    public float dientich;
    public final float PI = 3.14f;
    public void EnterData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r = ");
        bankinh = sc.nextFloat();
    }
    public void Tinhchuvi(){
        chuvi = 2*PI*bankinh ;
    }
    public void Tinhdientich(){
        dientich = PI * bankinh * bankinh ;
    }
    public void Display(){
        System.out.println("Chu vi hinh tron la : " + chuvi);
        System.out.println("Dien tich hinh tron la : " + dientich);
    }
}
