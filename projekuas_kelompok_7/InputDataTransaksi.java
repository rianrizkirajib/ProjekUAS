
package projekuas_kelompok_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;

public class InputDataTransaksi {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/vilasitugunung";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    
    public static void transaksi(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             INPUT DATA TRANSAKSI             ");
        System.out.println("==============================================");
        
        System.out.print("ID Pembayaran : ");
        String id_pembayaran = sc.nextLine();
        System.out.print("ID Pelanggan : ");
        String id_pelanggan = sc.nextLine();
        System.out.print("ID Kamar : ");
        String id_kamar = sc.nextLine();
        System.out.print("Harga Kamar : ");
        int harga_kamar = sc.nextInt();
                
        try{
            Database.DataTransaksi(id_pembayaran, id_pelanggan, id_kamar, harga_kamar);
            Menu2.menuForm();
        }
        catch(SQLException e){
            System.out.println();
            System.out.print("Input Data Transaksi Berhasil");
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
}