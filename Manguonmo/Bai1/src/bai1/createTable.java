package bai1;


import java.sql.Statement;

public class createTable {
    public static void main(String[] args) throws Exception {
        DAL a= new DAL();
        
        String LoaiSanPham = "CREATE TABLE LoaiSanPham( "
                + "MaLoaiSP VARCHAR(50) NOT NULL, "
                + "TenLoaiSP VARCHAR(50) NOT NULL, "
                + "CONSTRAINT pk1 PRIMARY KEY (MaLoaiSP))";
        
        String SanPham="CREATE TABLE SanPham("
                + "MaSP VARCHAR(50) NOT NULL,"
                + "TenSP VARCHAR(100) NOT NULL,"
                + "NhaSanXuat VARCHAR(100) NOT NULL,"
                + "MaLoaiSP VARCHAR(50) NOT NULL,"
                + "CONSTRAINT pk2 PRIMARY KEY(MaSP),"
                + "constraint fk1 foreign key(MaLoaiSP) references LoaiSanPham(MaLoaiSP))";
                
        
      
        
        Statement sta= a.getStatement();
        sta.execute(LoaiSanPham);
        sta.execute(SanPham);
        
        
    }
    
}
