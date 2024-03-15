import java.util.Scanner;

public class Employee {
    public String ID;
    public String FullName;
    public float Salary;
    public float TroCap;
    public float Sum;
    public void EnterData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        ID = sc.nextLine();
        System.out.print("Enter FullName : ");
        FullName = sc.nextLine();
        System.out.print("Enter Salary : ");
        Salary = sc.nextFloat();
        System.out.print("Enter Trocap : ");
        TroCap = sc.nextFloat();      
    }
    public void Sum(){
        Sum = Salary + TroCap ;
    }
    public void Display(){
        System.out.println("\nYour Resutl :");
        System.out.println("Your ID : " + ID );
        System.out.println("Your fullName : " + FullName );
        System.out.println("Your Salary : " + Salary);
        System.out.println("Your Tro cap : " + TroCap );
        System.out.println("Your FullSalary :" + Sum );
    }
}
