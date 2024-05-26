package advance.devv;
import advance.dev.model.CanBo;
import advance.dev.model.CongNhan;
import advance.dev.model.KySu;
import advance.dev.model.NhanVien;
import advance.dev.dao.Manager;
import advance.dev.model.IManager;

public class MainApp {
   public static void main(String[] args) {
	   IManager manager = new Manager();
	   manager.add(new CongNhan("Hậu", 18, "Nam","TP HCM", 10));
	   manager.add(new KySu("Tâm", 20, "Nam", "Hà Nội", "Công Nghệ Thông Tin"));
	   manager.add(new NhanVien("Phúc", 30, "Nam", "TP HCM","Bốc Vác"));
	   
	   manager.print();
	   
	   manager.sortByName(1);
	   System.out.println("Danh Sách cán bộ sau khi sắp xếp theo chiều tăng dần: ");
	   manager.print();
	   
	   manager.sortByName(-1);
	   System.out.println("Danh Sách cán bộ sau khi sắp xếp theo chiều giảm dần: ");
	   manager.print();
   }
}
