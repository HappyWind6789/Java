 class lab5slide4p2 extends Exception {
    public lab5slide4p2(String msg){
        super(msg);
    }
}
public class CheckedExceptionDemo {
    public static void main(String[] args) throws lab5slide4p2  {
        CheckedExceptionDemo.testCheckedException();
    }
    public static void testCheckedException() throws lab5slide4p2{
        System.out.println("Checked exception demo");
    }
    
}
