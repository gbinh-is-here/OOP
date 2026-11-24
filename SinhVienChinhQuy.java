package ontap;

import java.time.LocalDate;

public class SinhVienChinhQuy extends SinhVien{
	private  String  hocTrucTiep;
	
	public SinhVienChinhQuy(String maSv, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc, String hocTrucTiep)
	{
		super(maSv, hoTen, ngaySinh,soTinChi,monHoc, lop);
		this.hocTrucTiep = hocTrucTiep;
	}

	public String getHocTrucTiep() {
		return hocTrucTiep;
	}

	public void setHocTrucTiep(String hocTrucTiep) {
		this.hocTrucTiep = hocTrucTiep;
	}

@Override 
public String getLoai() {
	return  "Chinh Qui";
}

@Override 
public String getThongTinRieng() {
	return "hoc truc tiep tai " + hocTrucTiep;
}

@Override 
public String toString(){
 return super.toString() + "| Truong : " + getThongTinRieng();
}
}