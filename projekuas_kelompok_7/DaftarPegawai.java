/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuas_kelompok_7;

import java.util.Scanner;


public class DaftarPegawai {
    public static void DaftarPegawai(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             DAFTAR AKUN PEGAWAI             ");
        System.out.println("=============================================");
        
        System.out.print("Username : ");
        String id_pegawai = sc.nextLine();
        System.out.print("Nama Pegawai : ");
        String nama_pegawai = sc.nextLine();
        System.out.print("Jenis Kelamin : ");
        String jenis_kelamin = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
        System.out.print("Password : ");
        String pw = sc.nextLine();
        
        try{
            Database.insertAkun(id_pegawai, nama_pegawai, jenis_kelamin, alamat, pw);
            
            System.out.println("Username : " + id_pegawai);
            System.out.println("Password : " + pw);
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    } 
}