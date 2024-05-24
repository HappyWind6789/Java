import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<DQM509LinkedList> linkedList = new LinkedList<>();
        DQM509LinkedList std = new DQM509LinkedList();
        std.ThemThongTin(linkedList);
        std.SuaThongTin(linkedList);
        std.XoaThongTin(linkedList);
        std.HienThi(linkedList);
    }
}
