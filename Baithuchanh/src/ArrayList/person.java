package ArrayList;

import java.util.Scanner;

public class person {
    public String ID;
    public String FullName;
    public void EnterData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your ID : ");
        ID = sc.nextLine();
        System.out.print("Your FullName : ");
        FullName = sc.nextLine();
    }
    public void Display(){
        System.out.println("\nYour Information : ");
        System.out.println("Your ID : " + ID);
        System.out.println("Your FullName : " + FullName);
    }
}
