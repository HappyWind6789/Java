public class lab5slide12p2 {
    public static void main(String[] args) {
        try {
            int data = 25 ;
            if (data % 2 != 0) {
                System.out.println(data + "is odd number");
                return;
            }
            System.out.println(data);
        } catch (ArithmeticException e) {
           System.out.println(e);
        } finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code....");
   
    }
}
