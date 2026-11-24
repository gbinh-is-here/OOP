package ontap;

import java.time.LocalDate;
public class SinhVienTuXa extends SinhVien {
	private String nenTang;
	public SinhVienTuXa(String maSv, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc, String nenTang)
	{
		super(maSv, hoTen, ngaySinh, soTinChi, monHoc, lop);
		this.nenTang = nenTang;
	}
	
	public String getNenTang() {
		return nenTang;
	}
	public void setNenTang(String nenTang) {
		this.nenTang = nenTang;
	}
@Override
public String getLoai() {
	return "Tu Xa";
}

@Override 
public String getThongTinRieng() {
	return "hoc tai nen tang "  + nenTang;
}

@Override 
public double thanhTien() {
	return super.thanhTien() * 0.9;
}
@Override 
public String toString() {
	return super.toString() + "" + getThongTinRieng();
}
	
}
