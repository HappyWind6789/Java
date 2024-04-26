abstract class Bike {
    abstract void Run();
    
}

public class Honda4 extends Bike {
    void Run(){
        System.out.println("running safely....");

    }
    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.Run();
    }

}
