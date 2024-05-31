public class lab5slide4 extends RuntimeException {
    public lab5slide4(String msg){
        super(msg);
    }
    public class UncheckedExceptionDemo{
        public static void main(String[] args) {
            UncheckedExceptionDemo.testUncheckException();
        }
        public static void testUncheckException() throws lab5slide4{
            System.out.println("Unchecked exception demo");
        }
    }
}
