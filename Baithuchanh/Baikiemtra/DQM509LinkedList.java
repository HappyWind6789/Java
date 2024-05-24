
    public class DQM509LinkedList implements DQM509Interface {
        public String FullName;
        public String StudentID;
        public int Age;
        public void NhapThongTin(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap StudentID : ");
            StudentID = sc.nextLine();
            System.out.print("Nhap FullName : ");
            FullName = sc.nextLine();
            System.out.print("Nhap Age : ");
            Age = sc.nextInt();
        }
        public void ThemThongTin(LinkedList<DQM509LinkedList> linkedList){
            System.out.print("Nhap so luong can them : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0 ; i < n ; i++){
                DQM509Interface2 std = new DQM509Interface2();
                std.NhapThongTin();
                linkedList.add(std);
                System.out.println("Them thanh cong");
            }
        }
        public void SuaThongTin(LinkedList<DQM509LinkedList> linkedList){
            System.out.print("Nhap StudentID can sua: ");
            Scanner sc = new Scanner(System.in);
            String Id = sc.next();
            for(int i = 0 ; i < linkedList.size() ; i++){
                if (linkedList.get(i).StudentID.equals(Id)) {
                    System.out.println("Nhap FullName moi : ");
                    FullName = sc.next();
                    System.out.println("Nhap Age moi : ");
                    Age = sc.nextInt();
                }
            }
        }
        public void XoaThongTin(LinkedList<DQM509LinkedList> linkedList){
            System.out.println("Nhap StudentId can xoa : ");
            Scanner sc = new Scanner(System.in);
            String ID = sc.next();
            for (int i = 0 ; i < linkedList.size() ; i++){
                if (linkedList.get(i).StudentID.equals(ID)){
                    linkedList.remove(i);
                }
            }
        }
        public void HienThi(LinkedList<DQM509LinkedList> linkedList){
            for (int i = 0 ; i < linkedList.size() ; i++){
                System.out.println("StudentID : " + linkedList.get(i).StudentID);
                System.out.println("FullName : " + linkedList.get(i).FullName);
                System.out.println("Age : " + linkedList.get(i).Age);
            }
        }
}

