package lab4slide3.Lists;

import java.util.LinkedList;
import java.util.Scanner;

import lab4slide3.student2;

public class LinkedListDemo {
    public static void main(String[] args) {
       LinkedList<student2> linkedListsStudent2s = new LinkedList<>();
       student2 std = new student2();
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
                std.AddInforLinkedList(linkedListsStudent2s);
                break;
            case 2:
                std.EditInforLinkedList(linkedListsStudent2s);
                break;
            case 3:
                std.DeleteInforLinkedList(linkedListsStudent2s);
                break;
            case 4:
                for(student2 std2 : linkedListsStudent2s){
                std2.Display();
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
