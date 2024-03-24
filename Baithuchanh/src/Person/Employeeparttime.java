package Person;

public class Employeeparttime extends Employee {
    public Employeeparttime(){
        Salary = 23f;
    }
    public void CalculateSalary(){
        Salary = Salary * Hour + Subsidize ;
    }
}
