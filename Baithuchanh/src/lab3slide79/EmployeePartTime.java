package lab3slide79;

public class EmployeePartTime extends Employee {
    private int Hour;
    @Override
    public void KindOf(){
        System.out.println("Employee PartTime");
    }
    public void SetHour(int Hour){
        this.Hour = Hour ;
    }
    public int GetHour(){
        return Hour;
    }
    @Override
    public void SetSalary(){
        Salary = 100000f * GetHour();
    }
    
}
