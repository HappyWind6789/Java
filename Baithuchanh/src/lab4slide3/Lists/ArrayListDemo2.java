package lab4slide3.Lists;

import java.util.ArrayList;
import java.util.Scanner;

import lab4slide3.student2;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<student2> arrayListsStudent2s = new ArrayList<>();
        student2 std2 = new student2();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 Them thong tin");
            System.out.println("2 Sua thong tin");
            System.out.println("3 Xoa thong tin");
            System.out.println("4 Hien thi thong tin");
            System.out.println("5 Cancel");
            System.out.print("Answer:");
            int Answer = sc.nextInt();
            switch (Answer) {
                case 1:
                    std2.AddInforArrList(arrayListsStudent2s);
                    break;
                case 2:
                    std2.EditInforArrList(arrayListsStudent2s);
                    break;
                case 3:
                    std2.DeleteInforArrList(arrayListsStudent2s);
                    break;
                case 4:
                    for(student2 std : arrayListsStudent2s){
                    std.Display();
                    }
                    break;
                default:
                    System.out.println("Cancel");
                    break;
            } 
            if (Answer > 4) {
                break;
            }
        }
        
    }
}
