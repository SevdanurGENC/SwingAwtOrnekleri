package veritabaniuygulamasi;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    public static Connection conn = null;
    public static String url = "jdbc:mysql://localhost:3306/";
    public static String dbName = "vt";
    public static String driver = "com.mysql.jdbc.Driver";
    public static String userName = "root";
    public static String password = "root";
    public static Statement st;
    public static ResultSet res;
    public static String sql;
    
    public DBConnection() throws Exception { 
        TabloDoldur();     
    }
    
    public static Statement baglantiAc() throws Exception{
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url + dbName, userName, password); 
        return conn.createStatement();
    }
    
    public static void baglantiKapat() throws Exception{
        conn.close();
    }
    
    public static void TabloDoldur() throws Exception{ 
        try {
            st = baglantiAc();
            res = st.executeQuery("SELECT * FROM  kisiler"); 
            myTableModel model = new myTableModel(res);
            VeriTabaniUygulamasi.jTable1.setModel(model);
            baglantiKapat();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Baglanti Basarisiz...", "MySql Baglantisi", JOptionPane.PLAIN_MESSAGE);
        }
    }    
    
    public static void KayitEkle(String ad, String soyad, String yas, String cinsiyet){
        try {
            st = baglantiAc();
            sql = "INSERT INTO vt.kisiler(ad,soyad,yas,cinsiyet) "
                    + "VALUES('" + ad + "', '"  + soyad + "'," + yas + "," + cinsiyet + ")";
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Kayit Eklenemedi..", "MySql Baglantisi", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    
    public static void KayitGuncelle(String id, String ad,String soyad, String yas, String cinsiyet){
        try {
            st = baglantiAc();
            sql = "UPDATE vt.kisiler SET ad = '" + ad + "', soyad = '"+ soyad + "', yas = " + yas
                    + ", cinsiyet = " + cinsiyet + " WHERE id = " + id;
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, "Kayit Guncellenemedi..", "MySql Baglantisi", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public static void KayitSil(String id){
        try {
            st = baglantiAc();
            sql = "DELETE FROM vt.kisiler WHERE id = " + id;
            st.executeUpdate(sql);
            baglantiKapat();
            TabloDoldur();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Kayit Silinemedi..", "MySql Baglantisi", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
