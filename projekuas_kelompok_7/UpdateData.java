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
    
    public static void updatePelanggan(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             UPDATE DATA PELANGGAN             ");
        System.out.println("===============================================");
        
        System.out.print("Masukan id pelanggan yang ingin di update : ");
        String id_pelanggan = sc.nextLine();
        System.out.print("Nama Pelanggan \t\t: ");
        String nama_pelanggan = sc.nextLine();
        System.out.print("Alamat \t\t: ");
        String alamat = sc.nextLine();

        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update pelanggan set nama_pelanggan=?, alamat=? WHERE id_pelanggan=?";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, nama_pelanggan);
            ps.setString(2, alamat);
            ps.setString(3, id_pelanggan);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
                System.out.println();
                Menu2.menuPelanggan();
            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    public static void updateKamar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             UPDATE DATA KAMAR             ");
        System.out.println("===============================================");
        
        System.out.print("Masukkan ID Kamar yang ingin di update : ");
        String id_kamar = sc.nextLine();
        System.out.print("Tipe Kamar  : ");
        String tipe_kamar = sc.nextLine();
        System.out.print("Harga Kamar : ");
        int harga_kamar = sc.nextInt();
        System.out.print("Jumlah Kamar : ");
        int jumlah_kamar = sc.nextInt();
        sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update kamar set tipe_kamar=?, harga_kamar=?, jumlah_kamar=? WHERE id_kamar=?";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, tipe_kamar);
            ps.setInt(2, harga_kamar);
            ps.setInt(3, jumlah_kamar);
            ps.setString(4, id_kamar);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
                System.out.println();
                Menu2.menuKamar();
            }
            else{
                System.out.println("Proses Update Gagal");
            } 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void updateTransaksi(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             UPDATE DATA TRANSAKSI             ");
        System.out.println("===============================================");
        
        System.out.print("Masukan ID Pembayaran yang akan di update : ");
        String id_pembayaran = sc.nextLine();
        System.out.print("ID Pelanggan  : ");
        String id_pelanggan = sc.nextLine();
        System.out.print("ID Kamar : ");
        String id_kamar = sc.nextLine();
        System.out.print("Harga Kamar : ");
        int harga_kamar = sc.nextInt();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update pembayaran set id_pelanggan=?, id_kamar=?, harga_kamar=? WHERE id_pembayaran=?";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, id_pelanggan);
            ps.setString(2, id_kamar);
            ps.setInt(3, harga_kamar);
            ps.setString(4, id_pembayaran);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
                System.out.println();
                Menu2.menuTransaksi();
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
