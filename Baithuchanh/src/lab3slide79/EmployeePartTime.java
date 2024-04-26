package lab3slide79;

import java.util.Scanner;

public class EmployeePartTime extends Employee {
    private int Hour;
    @Override
    public void KindOf(){
       System.out.println("Employee PartTime");
    }
    public void Enterdata(){
        super.Enterdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Hour Work = ");
        Hour = sc.nextInt();
    }
    @Override
    public void Salary(){
        Salary = Employee.Income * Hour ;
    }
}
    

