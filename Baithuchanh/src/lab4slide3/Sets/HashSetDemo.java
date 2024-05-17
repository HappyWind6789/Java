package lab4slide3.Sets;

import java.util.HashSet;
import java.util.Scanner;

import lab4slide3.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSetsStudents = new HashSet<>();
        System.out.print("Nhap so luong can luu tru : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            Student std = new Student();
            std.EnterData();
            if (!hashSetsStudents.contains(std)){
                hashSetsStudents.add(std);
                System.out.println("Them thanh cong");;
            } else {
                System.out.println(" Student " + std + " da ton tai");
            }
        }
        for (Student studentdisplay : hashSetsStudents){
            studentdisplay.AddInfor();
            studentdisplay.Display();
            studentdisplay.EditInfor();
        }
        Student std2 = new Student();
        std2.EnterData();
        for(int i = 0 ; i < hashSetsStudents.size() ; i++){
            if (hashSetsStudents.contains(std2)) {
                hashSetsStudents.remove(std2);
                System.out.println("Remove succes");
            }
            else {
                System.out.println("Not Found To Remove");
            }
        }
        for (Student studentdisplay2 : hashSetsStudents){
            studentdisplay2.Display();
        }
    }
}
