import java.util.Scanner;

public class lab2slide81 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so cot : ");
        n = sc.nextInt();
        System.out.print("Nhap vao so hang : ");
        m = sc.nextInt();
        int A[] [] = new int[n] [m] ;
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < m ; j++){
                System.out.print(" Nhap vao A[ " + i +"] [" + j + "] =");
                A[i][j] = sc.nextInt();
            }
        }
            int max = A[0][0];
            for (int i = 0 ; i < n ; i++){
                for (int j = 0 ; j < m ; j++){
                    if (max < A[i][j])
                        max = A[i][j] ;
                }
            }
        System.out.println("Phan tu lon nhat cua mang : " + max );    
    }
}
