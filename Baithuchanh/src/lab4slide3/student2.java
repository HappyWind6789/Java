package lab4slide3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class student2 {
   public String StudentID;
   public String FullName;
   public int Age;
   Scanner sc = new Scanner(System.in);
   public student2(){
    this.StudentID = StudentID;
    this.FullName = FullName;
    this.Age = Age;
   }
   public void EnterData(){
    System.out.print("Enter Your StudentID : ");
    StudentID = sc.nextLine();
    System.out.print("Enter Your FullName : ");
    FullName = sc .nextLine();
    System.out.print("Enter Your Age : ");
    Age = sc.nextInt();
    System.out.println();
   }
   public void Display(){
    System.out.println("\nYour Information : ");
    System.out.println("Your FullName : " + FullName +" - Your Age : " + Age + " - Your StudentID : " + StudentID +"\n");
   }
   public void AddInforArrList(ArrayList<student2> arrayListsStudent2s){
    System.out.print("Nhap so luong can them : ");
    int n = sc.nextInt();
    for(int i = 0 ; i < n ; i++){
        student2 std = new student2();
        std.EnterData();
        arrayListsStudent2s.add(std);
    }
   }
   public void EditInforArrList(ArrayList<student2> arrayListsStudent2s){
    System.out.print("Enter StudentID to change : ");
    String Id = sc.next();
    for (int i = 0 ; i < arrayListsStudent2s.size() ; i++){
        if (arrayListsStudent2s.get(i).StudentID.equals(Id)) {
            System.out.print("\nBefor change : ");
            arrayListsStudent2s.get(i).Display();
            System.out.println("Change : ");
            System.out.print("Enter New FullName : ");
            String NewFullName = sc.next();
            System.out.print("Enter New Age : ");
            Integer NewAge = sc.nextInt();
            arrayListsStudent2s.get(i).FullName = NewFullName;
            arrayListsStudent2s.get(i).Age = NewAge;
            System.out.print("\nAfter change : ");
            arrayListsStudent2s.get(i).Display();
        }
    }
   }
   public void DeleteInforArrList(ArrayList<student2> arrayListsStudent2s){
    System.out.print("Enter StudentID to remove : ");
    String IdRemove = sc.next();
    for(int i = 0 ; i < arrayListsStudent2s.size() ; i++){
        if (arrayListsStudent2s.get(i).StudentID.equals(IdRemove)) {
            System.out.print("\nThis Student : ");
            arrayListsStudent2s.get(i).Display();
            System.out.println("You want to remove this Student?    Yes=1/No=0  ");
            int Answer = sc.nextInt();
            if (Answer == 1) {
                arrayListsStudent2s.remove(i);
                System.out.println("Remove succes");
                System.out.println("List: ");
                arrayListsStudent2s.get(i).Display();
                break;
            }
            else {
                System.out.println("Cancel");
                break;
            }
        } else {
            System.out.println("Not Found To Remove");
        }
        
    }
   }

   public void AddInforLinkedList(LinkedList<student2> linkedListsStudent2s){
    System.out.print("Nhap so luong can them : ");
    int n = sc.nextInt();
    for(int i = 0 ; i < n ; i++){
        student2 std = new student2();
        std.EnterData();
        linkedListsStudent2s.add(std);
    }
   }
   public void EditInforLinkedList(LinkedList<student2> linkedListsStudent2s){
    System.out.print("Enter StudentID to change : ");
    String Id = sc.next();
    for (int i = 0 ; i < linkedListsStudent2s.size() ; i++){
        if (linkedListsStudent2s.get(i).StudentID.equals(Id)) {
            System.out.print("\nBefor change : ");
            linkedListsStudent2s.get(i).Display();
            System.out.println("Change : ");
            System.out.print("Enter New FullName : ");
            String NewFullName = sc.next();
            System.out.print("Enter New Age : ");
            Integer NewAge = sc.nextInt();
            linkedListsStudent2s.get(i).FullName = NewFullName;
            linkedListsStudent2s.get(i).Age = NewAge;
            System.out.print("\nAfter change : ");
            linkedListsStudent2s.get(i).Display();
        }
    }
   }
   public void DeleteInforLinkedList(LinkedList<student2> linkedListsStudent2s){
    System.out.print("Enter StudentID to remove : ");
    String IdRemove = sc.next();
    for(int i = 0 ; i < linkedListsStudent2s.size() ; i++){
        if (linkedListsStudent2s.get(i).StudentID.equals(IdRemove)) {
            System.out.print("\nThis Student : ");
            linkedListsStudent2s.get(i).Display();
            System.out.println("You want to remove this Student?    Yes=1/No=0  ");
            int Answer = sc.nextInt();
            if (Answer == 1) {
                linkedListsStudent2s.remove(i);
                System.out.println("Remove succes");
                System.out.println("List: ");
                linkedListsStudent2s.get(i).Display();
                break;
            }
            else {
                System.out.println("Cancel");
                break;
            }
        } else {
            System.out.println("Not Found To Remove");
        }
    }
   }



   public void AddInforHashSet(HashSet<student2> hashSetsStudent2s){
    System.out.print("Nhap so luong can them : ");
    int n = sc.nextInt();
    for(int i = 0 ; i < n ; i++){
        student2 std = new student2();
        std.EnterData();
        hashSetsStudent2s.add(std);
    }
   }
   public void EditInforHashSet(HashSet<student2> hashSetsStudent2s){
    System.out.print("Enter StudentID to change : ");
    String Id = sc.next();
    for (student2 std3 : hashSetsStudent2s){
        if (std3.StudentID.equals(Id)) {
            System.out.print("\nBefor change : ");
            std3.Display();
            System.out.println("Change : ");
            System.out.print("Enter New FullName : ");
            String NewFullName = sc.next();
            System.out.print("Enter New Age : ");
            Integer NewAge = sc.nextInt();
            std3.FullName = NewFullName;
            std3.Age = NewAge;
            System.out.print("\nAfter change : ");
            std3.Display();
        }
    }
   }
   public void DeleteInforHashSet(HashSet<student2> hashSetsStudent2s){
    System.out.print("Enter StudentID to remove : ");
    String IdRemove = sc.next();
    for(student2 std3 : hashSetsStudent2s){
        if (std3.StudentID.equals(IdRemove)) {
            System.out.print("\nThis Student : ");
            std3.Display();
            System.out.println("You want to remove this Student?    Yes=1/No=0  ");
            int Answer = sc.nextInt();
            if (Answer == 1) {
                hashSetsStudent2s.remove(std3);
                System.out.println("Remove succes\n");

                break;
            }
            else {
                System.out.println("Cancel");
                break;
            }
        } else {
            System.out.println("Not Found To Remove");
        }
    }
   
}
}