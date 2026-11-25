package ontap;
import java.util.ArrayList;
import java.util.Comparator;
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
		 if(sv.getMaSv().equalsIgnoreCase(maSv)) return sv;
	 }
	 return null;
 }
 // lay tat ca
 public List<SinhVien> layTatCa() {
     return new ArrayList<>(danhSach);
 }
 // ham dai dien
 public List<SinhVien> tim(Predicate<SinhVien>dk){
	 List<SinhVien> kq = new ArrayList<>();
	 for(SinhVien sv : danhSach) {
	 if(dk.test(sv)) kq.add(sv);
	 }
 return kq ;
}
 
public List<SinhVien> timTheoTen(String tuKhoa){
	List<SinhVien> kq = new ArrayList<>();
	for (SinhVien sv:danhSach) {
		if(sv.getHoTen().toLowerCase().contains(tuKhoa.toLowerCase())) kq.add(sv);
	}
	return kq;
  }

public List<SinhVien> timTheoLop(String lop){
	List<SinhVien> kq = new ArrayList<>();
	for(SinhVien sv :danhSach) {
		if(sv.getLop().equalsIgnoreCase(lop)) kq.add(sv);
	}
	return kq;
  }

public List<SinhVien> timTheoLoai(String loai){
	List<SinhVien>kq = new ArrayList<>();
	for(SinhVien sv:danhSach) {
		if(sv.getLoai().equalsIgnoreCase(loai)) kq.add(sv);
	}
	return kq;
  }

public List<SinhVien> timTheoMon(MonHoc monHoc){
	List<SinhVien> kq = new ArrayList<>();
	for(SinhVien sv :danhSach) {
		if(sv.getMonhoc() == monHoc) kq.add(sv);
	}
	return kq;
}
//in tong so luong
public int TongSoLuong() {return danhSach.size();}
public double ThanhTien() {
	double tong = 0;
	for(SinhVien sv: danhSach) tong += sv.thanhTien();
	return tong;
}

//sap xep
public void sapxep(Comparator<SinhVien>cmp) {
	danhSach.sort(cmp);
}

public void sapxepgiamdan(Comparator<SinhVien>cmp) {
	danhSach.sort(cmp.reversed());
}

public List<SinhVien>sapXepTheoTen(){
	List<SinhVien>kq = new ArrayList<>(danhSach);
	kq.sort(Comparator.comparing(SinhVien :: getHoTen));
	return kq;
}

public List<SinhVien>sapXepTheoTienGiamDan(){
	List<SinhVien>kq = new ArrayList<>(danhSach);
	kq.sort(Comparator.comparingDouble(SinhVien :: thanhTien));
	return kq;
}

}
 
 