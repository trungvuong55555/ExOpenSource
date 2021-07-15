package bai1;

public class SanPham {
    private String maloaisp;
    private String tenloaisp;
    private String masp;
    private String tensp;
    private String nsx;

    public SanPham() {
    }

    public SanPham(String maloaisp, String tenloaisp, String masp, String tensp, String nsx) {
        this.maloaisp = maloaisp;
        this.tenloaisp = tenloaisp;
        this.masp = masp;
        this.tensp = tensp;
        this.nsx = nsx;
    }

    public String getMaloaisp() {
        return maloaisp;
    }

    public void setMaloaisp(String maloaisp) {
        this.maloaisp = maloaisp;
    }

    public String getTenloaisp() {
        return tenloaisp;
    }

    public void setTenloaisp(String tenloaisp) {
        this.tenloaisp = tenloaisp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }
    
    
}
