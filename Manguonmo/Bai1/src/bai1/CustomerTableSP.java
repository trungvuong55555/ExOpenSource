package bai1;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CustomerTableSP extends AbstractTableModel{
        private String name[]={"mã loại sản phẩm","tên loại sản phẩm","mã sản phẩm","tên sản phẩm","nhà sản xuất"};
    private Class truong[]={String.class,String.class,String.class};
    private ArrayList<SanPham> list= new ArrayList<SanPham>();

    public CustomerTableSP(ArrayList<SanPham> list) {
        this.list=list;
    }
    
    
    
    
    
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex)
        {
            case 0: return list.get(rowIndex).getMaloaisp();
            case 1: return list.get(rowIndex).getTenloaisp();
            case 2: return list.get(rowIndex).getMasp();
            case 3: return list.get(rowIndex).getTensp();
            case 4: return list.get(rowIndex).getNsx();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return name[column]; //super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
}
