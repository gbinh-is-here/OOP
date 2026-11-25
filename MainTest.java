package ontap;
import java.time.LocalDate;
public class MainTest {

    public static void main(String[] args) {

        // 1. Tao danh sach
        ListSinhVien ds = new ListSinhVien();

        // 2. Tao sinh vien
        SinhVien sv1 = new SinhVienChinhQuy(
            "SV01", "Nguyen An",
            LocalDate.of(2005, 5, 10),
            "CNTT", 20, MonHoc.JAVA, "Dai hoc ABC"
        );

        SinhVien sv2 = new SinhVienTuXa(
            "SV02", "Tran Binh",
            LocalDate.of(2005, 8, 15),
            "KTPM", 15, MonHoc.TOAN, "Zoom"
        );

        SinhVien sv3 = new SinhVienChinhQuy(
            "SV03", "Le Cuong",
            LocalDate.of(2005, 3, 20),
            "CNTT", 18, MonHoc.JAVA, "Dai hoc XYZ"
        );

        // 3. THEM SINH VIEN
        System.out.println("=== THEM ===");
        System.out.println(ds.them(sv1));
        System.out.println(ds.them(sv2));
        System.out.println(ds.them(sv3));

        // 4. LAY TAT CA
        System.out.println("=== DANH SACH ===");
        for (SinhVien sv : ds.layTatCa()) {
            System.out.println(sv);
        }

        // 5. TIM THEO MA
        System.out.println("=== TIM THEO MA ===");
        SinhVien tim = ds.timTheoMa("SV01");
        System.out.println(tim);

        // 6. TIM THEO TEN
        System.out.println("=== TIM THEO TEN ===");
        for (SinhVien sv : ds.timTheoTen("An")) {
            System.out.println(sv);
        }

        // 7. TIM THEO LOP
        System.out.println("=== TIM THEO LOP ===");
        for (SinhVien sv : ds.timTheoLop("CNTT")) {
            System.out.println(sv);
        }

        // 8. TIM THEO LOAI
        System.out.println("=== TIM THEO LOAI ===");
        for (SinhVien sv : ds.timTheoLoai("Chinh Qui")) {
            System.out.println(sv);
        }

        // 9. TIM THEO MON
        System.out.println("=== TIM THEO MON ===");
        for (SinhVien sv : ds.timTheoMon(MonHoc.JAVA)) {
            System.out.println(sv);
        }

        // 10. SUA SINH VIEN
        System.out.println("=== SUA ===");
        SinhVien svMoi = new SinhVienTuXa(
            "SV02", "Tran Binh Moi",
            LocalDate.of(2005, 8, 15),
            "KTPM", 20, MonHoc.TOAN, "Google Meet"
        );

        System.out.println(ds.sua("SV02", svMoi));

        // 11. TONG SO LUONG
        System.out.println("=== TONG SO LUONG ===");
        System.out.println(ds.TongSoLuong());

        // 12. TONG THANH TIEN
        System.out.println("=== TONG THANH TIEN ===");
        System.out.println(ds.ThanhTien());

        // 13. SAP XEP THEO TEN
        System.out.println("=== SAP XEP THEO TEN ===");
        for (SinhVien sv : ds.sapXepTheoTen()) {
            System.out.println(sv);
        }

        // 14. SAP XEP THANH TIEN GIAM DAN
        System.out.println("=== SAP XEP THANH TIEN ===");
        for (SinhVien sv : ds.sapXepTheoTienGiamDan()) {
            System.out.println(sv);
        }

        // 15. XOA SINH VIEN
        System.out.println("=== XOA ===");
        System.out.println(ds.xoa("SV03"));

        // 16. XOA TAT CA
        System.out.println("=== XOA TAT CA ===");
        System.out.println(ds.xoaTatCa());
    }
}
