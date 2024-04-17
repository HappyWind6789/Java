package lab3slide79;

public class EmployeePartTime extends Employee {
    private int Hour;
    @Override
    public String KindOf(){
        return"Employee PartTime";
    }
    
    @Override
    public void Salary(){
        Salary = Employee.Income * Hour ;
    }
    }
    

