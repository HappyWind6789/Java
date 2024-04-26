package lab3slide79;

public class Test {
    public static void main(String[] args)  {
        EmployeeFullTime employeeFullTime = new EmployeeFullTime();
        EmployeeFullTime employeeFullTime2 = new EmployeeFullTime();
        employeeFullTime.KindOf();
        employeeFullTime.Enterdata();
        employeeFullTime.Salary();
        employeeFullTime.Display();
        employeeFullTime2.KindOf();
        employeeFullTime2.Enterdata();
        employeeFullTime2.Salary(2);
        employeeFullTime2.Display();
        EmployeePartTime employeePartTime = new EmployeePartTime();
        employeePartTime.KindOf();
        employeePartTime.Enterdata();
        employeePartTime.Salary();
        employeePartTime.Display();
        

    }
    
    
}
