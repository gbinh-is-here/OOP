package ontap;
import java.util.List;
public interface IFSinhVien {
	//them xoa sua
	boolean them(SinhVien sv);
	boolean sua(String maSv , SinhVien svMoi);
	boolean xoa(String maSv);
	boolean xoaTatCa();
	
	//tim kiem
	List<SinhVien> layTatCa();
	SinhVien timTheoMa(String maSv);
	List<SinhVien> timTheoTen(String tuKhoa);
	List<SinhVien> timTheoLop(String lop);
	List<SinhVien> timTheoLoai(String loai);
	List<SinhVien> timTheoMon(MonHoc monHoc);
	
	// thong ke 
	int TongSoLuong();
	double ThanhTien();
	
	// Sap xep 
	List<SinhVien> sapXepTheoTen();
	List<SinhVien> sapXepTheoThanhTienGiamDan();
}
