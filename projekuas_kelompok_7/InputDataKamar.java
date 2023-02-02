/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuas_kelompok_7;

import java.util.Scanner;
import java.sql.SQLException;


public class InputDataKamar {
    public static void InputData(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             INPUT DATA KAMAR             ");
        System.out.println("==========================================");
        
        System.out.print("ID Kamar : ");
        String id_kamar = sc.nextLine();
        System.out.print("Tipe Kamar : ");
        String tipe_kamar = sc.nextLine();
        System.out.print("Harga Kamar : ");
        int harga_kamar = sc.nextInt();
        System.out.print("Jumlah Kamar : ");
        int jumlah_kamar = sc.nextInt();
//        sc.nextLine();
                
        try{
            Database.DataKamar(id_kamar, tipe_kamar, harga_kamar, jumlah_kamar);
            Menu2.menuForm();
        }
        catch(SQLException e){
            System.out.print("Kamar Sudah Berhasil Diinput");
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
}