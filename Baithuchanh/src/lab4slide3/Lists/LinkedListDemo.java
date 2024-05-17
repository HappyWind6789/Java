package lab4slide3.Lists;

import java.util.LinkedList;
import java.util.Scanner;

import lab4slide3.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedListStudents = new LinkedList<Student>();
        System.out.print("Nhap so luong can luu tru : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            Student std = new Student();
            std.EnterData();
            linkedListStudents.add(std);
        }
        linkedListStudents.get(0).AddInfor();
        for (int i = 0 ; i < linkedListStudents.size() ; i++){
            linkedListStudents.get(i).Display();
            linkedListStudents.get(i).EditInfor();
        } 
        linkedListStudents.remove(0);
        for (int i = 0 ; i < linkedListStudents.size() ; i++){
            linkedListStudents.get(i).Display();
        }
       
    }
}
