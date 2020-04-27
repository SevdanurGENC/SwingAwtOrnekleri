package veritabaniuygulamasi;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class myTableModel extends AbstractTableModel{
    public int satirSayisi, sutunSayisi;
    public static ResultSet resulSet;
    public ArrayList veri = new ArrayList();
     
    public myTableModel(ResultSet resulSet) throws Exception{
        setResultSet(resulSet);    
    }

    public void setResultSet(ResultSet resulSet) throws Exception{ 
        this.resulSet = resulSet;
        ResultSetMetaData metaData = resulSet.getMetaData();
        satirSayisi = 0;
        sutunSayisi = metaData.getColumnCount();
        while (resulSet.next()) {
            Object[] row = new Object[sutunSayisi];
            for (int j = 0; j< sutunSayisi; j++) {
                row[j] = resulSet.getObject(j+1);
            }
            veri.add(row);
            satirSayisi++;
        } 
    }
    
    public int getRowCount(){
        return satirSayisi;    
    }
    
    public int getColumnCount(){
        return sutunSayisi;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        Object[] row = (Object[]) veri.get(rowIndex);
        return row[columnIndex];
    }
    
    @Override
    public String getColumnName(int columnIndex){
        try {
            ResultSetMetaData metaData = resulSet.getMetaData();
            return metaData.getColumnName(columnIndex+1);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    } 
}
