package LinkedList;
import java.util.LinkedList;
public class lab4slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("C++");
        list.add("java");
        list.add("C#");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("List A: ");
        ShowList(listA);
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        ShowList(listA);
        list.removeAll(listB);
        ShowList(list);
    }
    public static void ShowList(LinkedList<String> list) {
        for (String obj : list){
            System.out.println("\t" + obj + ", ");
        }
        System.out.println();
    }
}
