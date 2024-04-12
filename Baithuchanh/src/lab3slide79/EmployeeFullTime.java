package lab3slide79;


public class EmployeeFullTime extends Employee {
    private static String Position;
    @Override
    public void KindOf(){
        System.out.println("Employee FullTime");
    }
    public void SetPosition(String Position){
       this.Position = Position;
    }
    public static String GetPosition(){
        System.out.println("Your Position = " + Position);
        return Position;
    }
    @Override
    public void SetSalary(){
        
        switch (this.Position) {
            case "Sep":
                this.Salary = 20000000f; 
                break;
        
            default:
                this.Salary = 10000000f;
                break;
        }
    }
    public void SetSalary(int OverTimeDay){
        this.Salary = this.Salary + 800000 * OverTimeDay;
    }


    
}
