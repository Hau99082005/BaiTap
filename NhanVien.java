package advance.dev.model;

public class NhanVien extends CanBo{
   private String Congviec;
   
   public NhanVien(String ten, int tuoi, String gioitinh, String diachi, String Congviec) {
	   super(ten, tuoi, gioitinh, diachi);
	   this.Congviec = Congviec;
   }
   public String getCongViec() {
	   return Congviec;
   }
   public void setCongViec(String Congviec) {
	   this.Congviec = Congviec;
   }
}
