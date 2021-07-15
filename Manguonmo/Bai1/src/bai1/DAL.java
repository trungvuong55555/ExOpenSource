package bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class DAL {
    public Connection getConnect() 
    {
        
        try{
            Connection con=null;
            String url="jdbc:derby://localhost:1527/bai1";
            String user="Quan";
            String pass="04dvqkdk";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=(Connection)DriverManager.getConnection(url, user, pass);
            return con;
        }
        catch (ClassNotFoundException|SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Khong the ket noi voi database \n"+e);
            return null;
        }
        
    }
    protected  Statement getStatement()throws Exception
    {
        Statement sta=null;
        Connection con= this.getConnect();
        sta=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        return sta;
    }
  
   
    public ResultSet getData(String qr)
    {
        try
        {
            ResultSet data;
            Statement sta= this.getConnect().createStatement();
            data= sta.executeQuery(qr);
            return data;
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
