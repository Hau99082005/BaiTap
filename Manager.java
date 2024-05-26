package advance.dev.dao;
import advance.dev.model.CanBo;
import advance.dev.model.IManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Manager implements IManager{
    private List<CanBo> canbolist = new ArrayList<>();
	
	@Override
	public void add(CanBo cb) {
		canbolist.add(cb);
	}

	@Override
	public void print() {
		for(CanBo cb : canbolist) {
			System.out.println("Ten: "+cb.getTen()+"Tuoi: "+cb.getTuoi()+"Gioi Tinh: "+cb.getGioitinh()+"Dia Chi: "+cb.getDiachi());
		}
	}

	@Override
	public void sortByName(int order) {
	  Collections.sort(canbolist, new Comparator<CanBo>() {
		  @Override
		  public int compare(CanBo cb1, CanBo cb2) {
			  return order * cb1.getTen().compareTo(cb2.getTen());
		  }
	  });
	}
   
}
