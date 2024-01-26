import java.util.Scanner;

public class lab2slide35 {
    public static void main(String[] args) {
        float n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = sc.nextFloat();
        System.out.print("Nhap i = ");
        i = sc.nextFloat();
        if (i < n) 
        System.out.println("So nho nhat la " + i);
        else if (i == n)
        System.out.println(" Hai so bang nhau ");
        else
        System.out.println("So nho nhat la "+ n);
    }
    
}
