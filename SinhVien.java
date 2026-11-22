package ontap;

import java.time.LocalDate;

public class SinhVien {

    protected String maSv;
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected int soTinChi;
    protected MonHoc monhoc;
    protected String lop;

    // Constructor
    public SinhVien(String maSv, String hoTen,
                    LocalDate ngaySinh, int soTinChi,
                    MonHoc monhoc, String lop) {

        this.maSv = maSv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soTinChi = soTinChi;
        this.monhoc = monhoc;
        this.lop = lop;
    }

    public double thanhTien() {
        return soTinChi * monhoc.getDonGia();
    }

    public String getLoai() {
        return "SinhVien";
    }

    
    public String getThongTinRieng() {
        return "";
    }

    
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public float getDonGia() {
        return monhoc.getDonGia();
    }

    public String getTenMonHoc() {
        return monhoc.getTenMon();
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    
    @Override
    public String toString() {

        return String.format(
            "[%s] %s | Lop: %s | NS: %s | Mon: %s (%d tin x %.0f) | TT: %.0f Vnd",
            maSv,
            hoTen,
            lop,
            ngaySinh,
            getTenMonHoc(),
            soTinChi,
            getDonGia(),
            thanhTien()
        );
    }
}
