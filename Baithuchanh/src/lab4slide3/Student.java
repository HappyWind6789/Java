package lab4slide3;

import java.util.Objects;
import java.util.Scanner;

public class Student {
   public String FullName;
   public int Age;
   public String StudentID;
   Scanner sc = new Scanner(System.in);
   public void EnterData(){
    System.out.print("Enter Your FullName : ");
    FullName = sc .nextLine();
    System.out.print("Enter Your Age : ");
    Age = sc.nextInt();
   }
   public void Display(){
    System.out.println("\nYour Information : ");
    System.out.println("Your FullName : " + FullName +" - Your Age : " + Age + " - Your StudentID : " + StudentID +"\n");
   }
   public void AddInfor(){
    System.out.print("Enter Your StudentID : ");
    StudentID = sc.next();
    System.out.println("Your StudentID : " + StudentID + "\n");
   }
   public void EditInfor(){
      System.out.println("You want to change your Infor?    Yes = 1/No = 0");
      Integer Answer = sc.nextInt();
      if (Answer == 1){
         System.out.println("Which infor you want to change?      FullName/Age/StudentID");
         String YourAnswer = sc.next();
      switch (YourAnswer) {
         case "FullName":
            System.out.print("Enter Your FullName = ");
            FullName = sc.next();
            break;
         case "Age":
            System.out.print("Enter Your Age = ");
            Age = sc.nextInt();
         break;
         case "StudentID":
            System.out.print("Enter Your StudentID = ");
            StudentID = sc.next();
            break;    
         default:
            System.out.print("Error: Not Found Your Infor");
            break;
      }
      } else {
         System.out.println("Cancel");
      }
   
   }
   @Override
   public boolean equals(Object o){
     Student student = (Student) o;
     return this.FullName == student.FullName && this.Age == student.Age ? true : false;
   }
   @Override
   public int hashCode(){
      return Objects.hash(FullName,Age,StudentID);
   }

}

