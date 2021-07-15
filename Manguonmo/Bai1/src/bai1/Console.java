package bai1;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Console {
    public static void main(String[] args) throws SQLException {
        BLLSP a = new BLLSP();
    
        ResultSet data= a.getData();
        
        while(data.next())
        {
            System.out.printf("%15s %15s %15s %15s %15s \n",data.getString(1),data.getString(2),data.getString(3),data.getString(4),data.getString(5));
        }
    
    }
    
  
    
}
