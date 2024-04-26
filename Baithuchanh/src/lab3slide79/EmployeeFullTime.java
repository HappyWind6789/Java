package lab3slide79;

import java.util.Scanner;

public class EmployeeFullTime extends Employee {
    private String Position;
    @Override
    protected void KindOf(){
        System.out.println( "Employee FullTime"); 
    }
    public void Enterdata(){
        super.Enterdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Position = ");
        Position = sc.nextLine();
    }
    public void Display(){
        super.Display();
        System.out.println("Your Position = " + Position);
    }
    @Override
    public void Salary(){
        switch (Position) {
            case "Sep":
                this.Salary = 20000000l; 
                break;
        
            default:
                this.Salary = 10000000l;
                break;
        }
    }
    public void Salary(int OverTimeDay){
        switch (Position) {
            case "Sep":
                this.Salary = 20000000l + 800000 * OverTimeDay; 
                break;
        
            default:
                this.Salary = 10000000l + 800000 * OverTimeDay;
                break;
        }
    }


    
}
