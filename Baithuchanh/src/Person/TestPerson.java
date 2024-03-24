package Person;

public class TestPerson {
    public static void main(String[] args) {
        Employeefulltime employeefulltime = new Employeefulltime();
        employeefulltime.PartOrFull("Fulltime");
        employeefulltime.EnterInformation();
        employeefulltime.CalculateSalary();
        employeefulltime.DisplayInformation();
        Employeeparttime employeeparttime = new Employeeparttime();
        employeeparttime.PartOrFull("\nParttime");
        employeeparttime.EnterInformation();
        employeeparttime.CalculateSalary();
        employeeparttime.DisplayInformation();
    }
}
