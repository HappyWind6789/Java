import java.util.Scanner;

public class lab2slide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngay;
        System.out.print("Nhap vao ngay = ");
        ngay = sc.nextInt();
        switch (ngay) {
            case 0: System.out.println("chu nhat");
                break;
            case 1: System.out.println(" thu 2");
                break;
            case 2: System.out.println(" thu 3");
                break;
            case 3: System.out.println(" thu 4");
                break;
            case 4: System.out.println(" thu 5");
                break;
            case 5: System.out.println(" thu 6");
                break;
            case 6: System.out.println(" thu 7");
                break;
            default: System.out.println("Khong phai ngay trong tuan");
                break;
        }
    }
    
}
