package lab4slide3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

import lab4slide3.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayListStudents = new ArrayList<>();
        System.out.print("Nhap so luong can luu tru : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            Student std = new Student();
            std.EnterData();
            arrayListStudents.add(std);
        }
        for (int i = 0 ; i < arrayListStudents.size() ; i++){
            arrayListStudents.get(i).Display();
            arrayListStudents.get(i).AddInfor();
            arrayListStudents.get(i).EditInfor();
        } 
        arrayListStudents.removeFirst();
        for (int i = 0; i < arrayListStudents.size() ; i++){
            arrayListStudents.get(i).Display();
        }
       
    }
}
