import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai5 {
    public String StudentID;
    public String FullName;
    public String Class;

    public Bai5(String StudentID, String FullName, String Class) {
        this.StudentID = StudentID;
        this.FullName = FullName;
        this.Class = Class;
    }

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Bai5> danhSachSV = new HashMap<>();
        System.out.print("Nhap so luong sinh vien : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Infor for Student " + (i + 1) + " : ");
            System.out.print("Enter StudentID : ");
            String StudentID = scanner.next();
            System.out.print("Enter FullName : ");
            String FullName = scanner.next();
            System.out.print("Enter Class : ");
            String Class = scanner.next();

            Bai5 sv = new Bai5(StudentID, FullName, Class);
            danhSachSV.put(StudentID, sv);
        }
        System.out.print("\nEnter Class to Find : ");
        String FindClass = scanner.next();
        System.out.println("Danh sach sinh vien thuoc lop " + FindClass + ":");
        Set<Map.Entry<String, Bai5>> setHashMap = danhSachSV.entrySet();
        for(Map.Entry<String, Bai5> setEntry : setHashMap) {
            if (setEntry.getValue().Class.equals(FindClass)) {
                System.out.println(setEntry.getValue().StudentID + " - " + setEntry.getValue().FullName);
            }
        }
        System.out.print("\nEnter StudentID to Find : ");
        String FindStudentID = scanner.next();
        Bai5 sinhVienTimThay = danhSachSV.get(FindStudentID);
        if (sinhVienTimThay != null) {
            System.out.println("Infor : ");
            System.out.println("StudentID : " + sinhVienTimThay.StudentID);
            System.out.println("FullName : " + sinhVienTimThay.FullName);
            System.out.println("Class : " + sinhVienTimThay.Class);
        } else {
            System.out.println("Not Found.");
        }
    }
}
}
