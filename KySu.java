package advance.dev.model;

public class KySu extends CanBo{
    private String NghanhDaoTao;
    
    public KySu(String ten, int tuoi, String gioitinh, String diachi, String NghanhDaoTao) {
    	super(ten, tuoi, gioitinh, diachi);
    	this.NghanhDaoTao = NghanhDaoTao;
    }
    public String getNghanhDaotao() {
    	return NghanhDaoTao;
    }
    public void setNghanhDaotao(String NghanhDaoTao) {
    	this.NghanhDaoTao = NghanhDaoTao;
    }
}
