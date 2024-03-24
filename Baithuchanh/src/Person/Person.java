package Person;

import java.util.Scanner;

public class Person {
    public String FullName;
    public int Age;
    public String Gender;
    public int IDcard;
    public Person(){
        FullName = "";
    }
    public void Status(String Status){
        System.out.println("Your Status :" + Status);
    }
    public void EnterInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("FullName = ");
        FullName = sc.nextLine();
        System.out.print("Age = ");
        Age = sc.nextInt();
        System.out.print("Gender = ");
        Gender = sc.next();
        System.out.print("IDcard = ");
        IDcard = sc.nextInt();
    }
    public void DisplayInfor(){
        System.out.println("\nYour Information: \n");
        System.out.println("FullName = " + FullName);
        System.out.println("Age = " + Age);
        System.out.println("Gender = " + Gender);
        System.out.println("IDcard = " + IDcard);
    }
  
    
}
