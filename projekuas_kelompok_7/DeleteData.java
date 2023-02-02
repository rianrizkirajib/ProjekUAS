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


public class DeleteData {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/vilasitugunung";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static ResultSet state;
    static PreparedStatement ps;
    
    public static void deletePelanggan(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DELETE DATA PELANGGAN             ");
        System.out.println("===============================================");
        
        System.out.print("ID Pelanggan : ");
        String id_pelanggan = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "delete FROM pelanggan WHERE id_pelanggan=?";
            ps = con.prepareStatement(query);
            ps.setString(1, id_pelanggan);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Proses Delete Berhasil");
                Menu2.menuPelanggan();
            }
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
    
    public static void deleteKamar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DELETE DATA KAMAR             ");
        System.out.println("===============================================");
        
        System.out.print("ID Kamar : ");
        String id_kamar = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "delete FROM kamar WHERE id_kamar=?";
            ps = con.prepareStatement(query);
            ps.setString(1, id_kamar);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Proses Delete Berhasil");
            }
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
    
    public static void deleteTransaksi(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DELETE DATA TRANSAKSI             ");
        System.out.println("===============================================");
        
        System.out.print("ID Pembayaran : ");
        String id_pembayaran = sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "delete FROM pembayaran WHERE id_pembayaran=?";
            ps = con.prepareStatement(query);
            ps.setString(1, id_pembayaran);
            
            if(ps.executeUpdate() > 0){
                System.out.println("Proses Delete Berhasil");
            }
            else{
                System.out.println("Data Tidak Ditemukan");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }  
    }
}