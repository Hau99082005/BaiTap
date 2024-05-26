package advance.dev.model;

public class CongNhan extends CanBo {
     private int bac;
     
     public CongNhan(String ten, int tuoi, String gioitinh, String diachi, int bac) {
    	 super(ten, tuoi, gioitinh, diachi);
    	 this.bac = bac;
     }
     public int getBac() {
    	 return bac;
     }
     public void setBac(int bac) {
    	 this.bac = bac;
     }
}
