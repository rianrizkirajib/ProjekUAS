/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuas_kelompok_7;

import java.util.Scanner;


public class InputDataPelanggan {
    public static void InputData(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             INPUT DATA PELANGGAN             ");
        System.out.println("==============================================");
        
        System.out.print("ID Pelanggan : ");
        String id_pelanggan = sc.nextLine();
        System.out.print("Nama Pelanggan : ");
        String nama_pelanggan = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
                
        try{
            Database.DataPelanggan(id_pelanggan, nama_pelanggan, alamat);
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    } 
}
