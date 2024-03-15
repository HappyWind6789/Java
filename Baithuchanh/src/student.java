import java.util.Scanner;

public class student {
    public String ID;
    public String FullName;
    public float Toan;
    public float Van;
    public float Anh;
    public float Plus = 0;
    public void EnterData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your ID : ");
        ID = sc.nextLine();
        System.out.print("Your fullName : ");
        FullName = sc.nextLine();
        System.out.print("Math point : ");
        Toan = sc.nextFloat();
        System.out.print("Literature point : ");
        Van = sc.nextFloat();
        System.out.print("English point : ");
        Anh = sc.nextFloat();
    }
    public void Plus(){
        Plus = Toan + Van + Anh ;
    }
    public void Display(){
        System.out.println("\nYour Resutl :");
        System.out.println("Your ID : " + ID );
        System.out.println("Your fullName : " + FullName );
        System.out.println("Your Math point : " + Toan);
        System.out.println("Your Literature point : " + Van );
        System.out.println("Your English point : " + Anh );
        System.out.println("Sum :" + Plus );
    }
}
