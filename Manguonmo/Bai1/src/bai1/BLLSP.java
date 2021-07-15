package bai1;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BLLSP {
    public DAL a= new DAL();
    
    public ResultSet getData()
    {
        
        return a.getData("select * from LOAISANPHAM inner join SANPHAM on LOAISANPHAM.MaLoaiSP= SANPHAM.MaLoaiSP ");
       
    }
    
     public void insert(String maloaisp, String tenloaisp, String masp, String tensp,String nsx) throws Exception
    {
        try{
            a.getStatement().executeUpdate("insert into LOAISANPHAM values('"+maloaisp+"','"+tenloaisp+"') ");
            a.getStatement().executeUpdate("insert into SANPHAM values('"+masp+"','"+tensp+"','"+nsx+"','"+maloaisp+"') ");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
