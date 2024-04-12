package lab3slide79;

public class Employee {
    private String EmployeeID;
    private String FullName;
    public Float Salary;
    public Employee(){
        EmployeeID = "";
        FullName = "";
    }
    public void SetEmployeeID(String EmployeeID){
        this.EmployeeID = EmployeeID ;
    }
    public String GetEmployyeeID(){
        System.out.println("Your EmployeeID = " + EmployeeID);
        return EmployeeID;
    }
    public void SetFullName(String FullName){
        this.FullName = FullName ;
    }
    public String GetFullName(){
        System.out.println("Your FullName = " + FullName);
        return FullName;
    }
    public void KindOf(){
        System.out.println("");
    }
    public void SetSalary(){
        Salary = 0f;
    }     
    public float GetSalary(){
        System.out.println("Your Salary = " + Salary);
        return Salary;
    }
}

