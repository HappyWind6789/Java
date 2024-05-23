import java.util.LinkedList;

public class Bai3 {
    public static void main(String[] args) {
        LinkedList<Bai3Student> linkedListBai3Students = new LinkedList<Bai3Student>();
        Bai3Student std = new Bai3Student();
        std.AddStudent(linkedListBai3Students);
        std.Check(linkedListBai3Students);
        std.Max(linkedListBai3Students);
        std.FindStudent(linkedListBai3Students);
    }
}
