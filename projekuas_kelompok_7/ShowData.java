
package projekuas_kelompok_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

public class ShowData {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/vilasitugunung";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    static Statement state;
    
    public static void showDataPelanggan(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM pelanggan";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID Pelanggan      : " + rs.getString("id_pelanggan"));
                System.out.println("Nama Pelanggan    : " + rs.getString("nama_pelanggan"));
                System.out.println("Alamat            : " + rs.getString("alamat"));
                System.out.println("-------------------------------------------------------");
            } 
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public static void showDataKamar(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM kamar";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID Kamar\t: " + rs.getString("id_kamar"));
                System.out.println("Tipe Kamar\t: " + rs.getString("tipe_kamar"));
                System.out.println("Harga Kamar\t: " + rs.getInt("harga_kamar"));
                System.out.println("Jumlah Kamar\t: " + rs.getInt("jumlah_kamar"));
                System.out.println("-------------------------------------------------------");
            } 
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
    
    public static void showDataTransaksi(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM pembayaran";
            state = con.createStatement();
            rs = state.executeQuery(query);
            
            while(rs.next()){
                System.out.println("ID Peminjaman\t: " + rs.getString("id_pembayaran"));
                System.out.println("ID Pelanggan\t: " + rs.getString("id_pelanggan"));
                System.out.println("ID Kamar\t: " + rs.getString("id_kamar"));
                System.out.println("Harga Kamar\t: " + rs.getInt("harga_kamar"));
                System.out.println("-------------------------------------------------------");
            } 
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }
}
