package Person;

public class Employeefulltime extends Employee {
    public Employeefulltime(){
        Salary = 25f;
    }
    public void CalculateSalary(){
        switch (Position) {
            case ("Truong phong"):
                Salary = Salary * Hour * 5 + Subsidize;
                break;
            case ("Thu Ky"):
                Salary = Salary * Hour * 3 + Subsidize;
                break;
            case ("Giam doc"):
                Salary = Salary * Hour * 7 + Subsidize;
                break;
            default:
                Salary = Salary * Hour * 1.5f + Subsidize;
                break;
        }
    }
}
