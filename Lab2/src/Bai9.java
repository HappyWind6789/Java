import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String chuoi;
    char kytu;
    int demthuong = 0, demhoa = 0, demso = 0;
    System.out.print("Nhap vao chuoi : ");
    chuoi = sc.nextLine();
    for (int i = 0 ; i < chuoi.length() ; i++){
        kytu = chuoi.charAt(i);
        int maASCII = kytu;
        if (maASCII <= 57 && maASCII >= 48){
            demso ++;
        }
        else if (maASCII <= 90 && maASCII >= 65){
            demhoa ++;
        } else if (maASCII <= 122 && maASCII >= 97){
            demthuong ++;
        }
    }
    System.out.println("So ky tu hoa la : "+ demhoa);
    System.out.println("So ky tu thuong la : "+ demthuong);
    System.out.println("So ky tu so la : "+ demso);
    }
}
