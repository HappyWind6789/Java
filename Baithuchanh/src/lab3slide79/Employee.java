package lab3slide79;

import java.util.Scanner;

public class Employee {
    protected String EmployeeID;
    protected String FullName;
    protected static Float Salary;
    public Employee(){
        EmployeeID = "";
        FullName = "";
    }
    public static final long Income = 100000;
    protected String KindOf(){
        return "";
    }
    public void Enterdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your EmployeeID = ");
        EmployeeID = sc.nextLine();
        System.out.println("Your FullName = ");
        FullName = sc.nextLine();
    }
    public void Display(){
        System.out.println("Your EmployeeID = " + EmployeeID);
        System.out.println("Your FullName = " + FullName);
        System.out.println("Your Salary = " + Salary);
    }   
    public void Salary(){
        Salary = 0f;
    }
}

