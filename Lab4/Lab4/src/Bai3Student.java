import java.util.LinkedList;
import java.util.Scanner;

public class Bai3Student {
    public String FullName;
    public Float Point;
    public void EnterInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Point : ");
        Point = sc.nextFloat();
    }
    public void Display(){
        System.out.println("Your FullName : " + FullName);
        System.out.println("Your Point : " + Point + "\n");
    }
    public void AddStudent(LinkedList<Bai3Student> linkedListsBai3Students){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student FullName (Enter an empty string to stop) : ");
        FullName = sc.nextLine();
        while (!FullName.isEmpty()) {
            Bai3Student std = new Bai3Student(); 
            std.FullName = FullName;
            std.EnterInfor();
            linkedListsBai3Students.add(std);
            System.out.println("Student added.");
            System.out.print("Enter next student FullName (Enter an empty string to stop) : ");
            FullName = sc.nextLine();
        }
        System.out.println("\nList : ");
        for (Bai3Student student : linkedListsBai3Students) {
            student.Display();
        }
    }
    int dem = 0;
    public void Check(LinkedList<Bai3Student> linkedListbBai3Students){
        for(int i = 0 ; i < linkedListbBai3Students.size() ; i++){
            if (linkedListbBai3Students.get(i).Point <= 5) {
                System.out.println("Sinh vien phai thi lai : ");
                linkedListbBai3Students.get(i).Display();
                dem++;
            }
        }
        System.out.println("Tong so sinh vien phai thi lai la : " + dem);
    }
    public void Max(LinkedList<Bai3Student> linkedListsBai3Students){
        Float Max = linkedListsBai3Students.getFirst().Point;
        for(Bai3Student std1 : linkedListsBai3Students){
            if (std1.Point.compareTo(Max) > 0) {
                Max = std1.Point;
            }
        }
        LinkedList<Bai3Student> linkedListMax = new LinkedList<>();
        for(Bai3Student std2 : linkedListsBai3Students){
            if (std2.Point.equals(Max)) {
                linkedListMax.add(std2);
            }
        }
        System.out.println("\nDanh sach sinh vien co diem cao nhat : ");
        for (Bai3Student std3 : linkedListMax){
            std3.Display();
        }
    }
    public void FindStudent(LinkedList<Bai3Student> linkedListsBai3Students){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student FullName to Find : ");
        String FullName = sc.nextLine();
        while (!FullName.isEmpty()) {
            for(Bai3Student student : linkedListsBai3Students){
                if (student.FullName.equals(FullName)) {
                    System.out.println("Your Infor : ");
                    student.Display();
                }
            }
            System.out.print("Enter next Student FullName to Find (Enter an empty string to stop) : ");
            FullName = sc.nextLine();
        }
        System.out.println("Stop Find");
    }
}
