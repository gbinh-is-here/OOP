package ontap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListSinhVien implements IFSinhVien{
private  ArrayList<SinhVien> danhSach  = new ArrayList();

public  ListSinhVien() {}

public ListSinhVien(ArrayList <SinhVien>ds) {
	danhSach = ds;
}
 public boolean them(SinhVien sv) {
	 if(sv == null || timTheoMa(sv.getMaSv()) != null)
		 return false;
	 return  danhSach.add(sv);
 }
 
 public boolean xoa(String maSV) {
     return danhSach.removeIf(sv -> sv.getMaSv().equals(maSV));
 }
 
 public boolean sua(String ma, SinhVien svMoi) {
	 for (int i = 0 ; i < danhSach.size() ; i++) {
		 if(danhSach .get(i).getMaSv().equals(ma)) {
			 danhSach .set(i, svMoi);
			 return true ;
		 }
	 }
	 return false;
 }
 
 public boolean xoaTatCa() {
	 if(danhSach.isEmpty())return false;
	 danhSach.clear();
	 return true;
 }
 
 public SinhVien timTheoMa(String maSv) {
	 for (SinhVien sv:danhSach) {
		 if(sv.getMaSv().equalsIgnoreCase(maSv)); return sv;
	 }
	 return null;
 }
 // ham dai dien
 public List<SinhVien> tim(Predicate<SinhVien>dk){
	 List<SinhVien> kq = new ArrayList<>();
	 for(SinhVien sv : danhSach) {
	 if(dk.test(sv));
	 kq.add(sv);
 }
 return kq ;
}
 
}
 
 