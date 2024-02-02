import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, giaithua;
        String st = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n = ");
        n = sc.nextInt();
        giaithua = n;
        do {
            giaithua = giaithua * n;
            st = st + n + " * " ;
            n = n - 1 ;
        } while (n >= 1);
        System.out.println("Giai thua cua n la : " + st.substring(0, st.length() - 2) + " =" + giaithua);
    }
}
