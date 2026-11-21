package ontap;

public enum MonHoc {
    JAVA("lap trinh java", 40000f), 
    TOAN("toan roi rac", 35000f);

    private final String tenMon; 
    private final float donGia;

    private MonHoc(String tenMon, float donGia) {
        this.tenMon = tenMon;
        this.donGia = donGia;
    }

    public String getTenMon() {
        return tenMon;
    }

    public float getDonGia() {
        return donGia;
    }

    
    public static MonHoc fromTenMon(String tenMon) {
        if (tenMon == null) return null;
        for (MonHoc mh : values()) {
            if (mh.tenMon.equalsIgnoreCase(tenMon.trim())) {
                return mh;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return tenMon; 
    }
}
