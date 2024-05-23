package lab4slide3.Sets;

import java.util.HashSet;
import java.util.Scanner;

import lab4slide3.student2;

public class HashSetDemo {
    public static void main(String[] args) {
     HashSet<student2> hashSetsStudent2s = new HashSet<>();
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
                std.AddInforHashSet(hashSetsStudent2s);
                break;
            case 2:
                std.EditInforHashSet(hashSetsStudent2s);
                break;
            case 3:
                std.DeleteInforHashSet(hashSetsStudent2s);
                break;
            case 4:
                for(student2 std2 : hashSetsStudent2s){
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
