import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0 ;
        String st = "";
        while (sum < 100){
            System.out.print("Nhap so nguyen : ");
            n = sc.nextInt();
            sum = sum + n;
            st = st + n + " + ";
        }
        System.out.println("Tong cac so nguyen la : "+ st.substring(0, st.length() - 2)  + " = " + sum);
    }
}
