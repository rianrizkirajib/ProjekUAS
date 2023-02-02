/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuas_kelompok_7;

import java.util.Scanner;
import java.lang.RuntimeException;

public class Menu2 {
    static void menuForm(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("             MENU UTAMA             ");
        System.out.println("=====================================");
        System.out.println("1. Data Pelanggan");
        System.out.println("2. Data Kamar");
        System.out.println("3. Data Transaksi");
        System.out.println("4. Keluar");
        System.out.println();
            
        System.out.print("Pilihan [1/2/3/4] = ");
        int pilih = sc.nextInt();
        System.out.println();
            
        if(pilih == 1){
            menuPelanggan();
        }
        else if(pilih == 2){
            menuKamar();
        }
        else if(pilih == 3){
            menuTransaksi();
        }
        else if(pilih == 4){
            System.exit(0);
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
        }
        
        try{
            menuForm();
        }
        catch(java.lang.RuntimeException e){
            System.out.println("masukan data yang valid");
            
        }
        catch(Exception e){
            System.out.println("Ada Sebuah Kesalahan");
            System.out.println("Error Message : " +e.getMessage());
            e.printStackTrace();
        }
    }
    
        public static void menuPelanggan(){
            System.out.println("             MANIPULASI DATA PELANGGAN             ");
            System.out.println("=======================================================");
            System.out.println("1. Input Pelanggan Baru");
            System.out.println("2. Update Pelanggan");
            System.out.println("3. Delete Pelanggan");
            System.out.println("4. Lihat Pelanggan");
            System.out.println("5. Keluar"); 
            System.out.println();
            
            System.out.print("Pilihan [1/2/3/4/5] = ");
            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
            System.out.println();
            
            if(pilih == 1){
               InputDataPelanggan.InputData();
            }
            else if(pilih == 2){
                UpdateData.updatePelanggan();
            }
            else if(pilih == 3){
                DeleteData.deletePelanggan();
            }
            else if(pilih == 4){
                ShowData.showDataPelanggan();
            }
            else if(pilih == 5){
                menuForm();
            }
            else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
            }
        }
            
        public static void menuKamar(){
            System.out.println("             MANIPULASI DATA KAMAR             ");
            System.out.println("=======================================================");
            System.out.println("1. Input Data Kamar");
            System.out.println("2. Update Kamar");
            System.out.println("3. Delete Kamar");
            System.out.println("4. Lihat Kamar");
            System.out.println("5. Keluar"); 
            System.out.println();
            
            System.out.print("Pilihan [1/2/3/4/5] = ");
            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
            System.out.println();
            
            if(pilih == 1){
               InputDataKamar.InputData();
            }
            else if(pilih == 2){
                UpdateData.updateKamar();
            }
            else if(pilih == 3){
                DeleteData.deleteKamar();
            }
            else if(pilih == 4){
                ShowData.showDataKamar();
            }
            else if(pilih == 5){
                System.exit(0);
            }
            else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
            }
        }
    
        public static void menuTransaksi(){
            System.out.println("             MANIPULASI DATA TRANSAKSI             ");
            System.out.println("=======================================================");
            System.out.println("1. Input Transaksi");
            System.out.println("2. Update Transaksi");
            System.out.println("3. Delete Transaksi");
            System.out.println("4. Lihat Transaksi");
            System.out.println("5. Keluar"); 
            System.out.println();
            
            System.out.print("Pilihan [1/2/3/4/5] = ");
            Scanner sc = new Scanner(System.in);
            int pilih = sc.nextInt();
            System.out.println();
            
            if(pilih == 1){
               InputDataTransaksi.transaksi();
            }
            else if(pilih == 2){
                UpdateData.updateTransaksi();
            }
            else if(pilih == 3){
                DeleteData.deleteTransaksi();
            }
            else if(pilih == 4){
                ShowData.showDataTransaksi();
            }
            else if(pilih == 5){
                System.exit(0);
            }
            else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            menuForm();
            }
        }
}