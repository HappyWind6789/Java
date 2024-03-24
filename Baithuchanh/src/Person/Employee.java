package Person;

import java.util.Scanner;

public class Employee extends Person{
    public String EmployeeID;
    public String Group;
    public String Position;
    public Float Salary;
    public float Subsidize;
    public Float Hour;
    public Employee(){
        EmployeeID = "";
    }
    public void PartOrFull(String PartOrFull){
        System.out.println(PartOrFull);
    }
    public void EnterInformation(){
        super.EnterInfor();
        Scanner sc = new Scanner(System.in);
        System.out.print("EmployeeID = ");
        EmployeeID = sc.nextLine();
        System.out.print("Group : ");
        Group = sc.nextLine();
        System.out.print("Position : ");
        Position = sc.nextLine();
        System.out.print("Subsidize : ");
        Subsidize = sc.nextFloat();
        System.out.print("Hour = ");
        Hour = sc.nextFloat();
    }
    public void DisplayInformation(){
        super.DisplayInfor();
        System.out.println("Your EmployeeID = " + EmployeeID);
        System.out.println("Your Group = " + Group);
        System.out.println("Your Position = " + Position);
        System.out.println("Your Subsidize = " + Subsidize);
        System.out.println("Your Work Hour = " + Hour);
        System.out.println("Your Salary = " + Salary);
    }

}
