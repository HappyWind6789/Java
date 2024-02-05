import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;
        do {
            System.out.print("Nhap vao do dai mang : ");
            n = sc.nextInt();
        } while (n < 0);
        int []A = new int[n];
        for (int i = 0; i < n ; i++){
            System.out.print("Nhap vao phan tu thu " + i + " = ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++){
            System.out.println("Mang ban dau la : " + A[i]);
        }
        for (int i = 0 ; i < n - 1 ; i++){
            for (int j = i + 1 ; j < n ; j++){
                if (A[i] > A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        for (int i = 0; i < n ; i++){
            System.out.println("Mang sau khi sap xep tang dan la : " + A[i]);
        }
    }
}
