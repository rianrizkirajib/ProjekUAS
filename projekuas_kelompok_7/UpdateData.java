/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuas_kelompok_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class UpdateData {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/vilasitugunung";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
    public static void update() throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             UPDATE DATA PELANGGAN             ");
        System.out.println("===============================================");
        
        System.out.print("Nama Pelanggan Sebelumnya : ");
        String nama_pel = sc.nextLine();
        System.out.print("Nama Pelanggan  : ");
        String nama_pelanggan = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
        System.out.print("ID Pegawai : ");
        String id_pegawai = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update pelanggan set nama_pelanggan=?, alamat=?, id_pegawai=? WHERE nama_pelanggan=?";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, nama_pelanggan);
            ps.setString(2, alamat);
            ps.setString(3, id_pegawai);
            ps.setString(4, nama_pel);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    } 
}
