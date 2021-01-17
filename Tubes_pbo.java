/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

import java.util.Scanner;

class P{
    String tujuan;
    int harga,jumlah,bayar,tagihan,pajak,kembali;
   
    void beliTiket(){
        pajak = harga * 10/100;
        if(jumlah>3){
            harga = harga * 2/100;
    }
        tagihan =(harga*jumlah)+pajak;
        System.out.println("Membeli Dengan Jumlah " +jumlah+ "tiket pesawat dengan tujuan" +tujuan);
        System.out.println("Tagihan anda adalah sebesar Rp. "+ tagihan);
        System.out.println("Sudah termasuk PAJAK 10%");
    }
    void kembalian(){
        kembali = bayar - tagihan;
    }
   
}
public class Tubes_pbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        P pswt = new P();
       
      
        System.out.print("Penjualan Tiket Pesawat");
       
        System.out.println();
       
        System.out.print( "BANDARA RADEN INTEN");
        System.out.println();
        for (int i = 0; i < 23; i++){
            System.out.print("=");
           
        }
        System.out.println();
       
        System.out.print("Masukan Nama Anda : ");
        String nama = scan.next();
       
        System.out.println();
       
        String tiket[][] = {{"", "Menado", "Makasar", "Semarang", "Jambi", "Maluku"},{"", "2000000", "3500000", "1000000",     "2500000", "1500000"}};
       
        System.out.println("Daftar Tiket - Harga");
        int var1 = 0;
        int var2 = 1;
       
        for (int i = 1; i < tiket[var1].length; i++){
            System.out.println(i + "."+ tiket[var1][i]+ "\t Rp."+ tiket [var2][i]);
        }
        System.out.println("Masukan Pilihan : ");
       
        int kode = scan.nextInt();
       
        System.out.println("Jumlah yang dibeli : ");
       
        int jmlBeli = scan.nextInt();
        pswt.jumlah = jmlBeli;
       
        System.out.println();
       
        if (kode == 1 || kode == 2 || kode == 3 || kode == 4 || kode == 5){
            int i = 0;
           
           
          for (int j = 0; i < tiket[var1].length; i ++) {
                if (kode == i) {
                    String tujuan = tiket[var1][i];
                    int harga = Integer.parseInt(tiket[var2][i]);

                    pswt.tujuan = tujuan;
                    pswt.harga = harga;
                }
          }
     
            System.out.println();
        }
        pswt.beliTiket();
        System.out.print("Jumlah Bayar : Rp.");
       
        int bayar = scan.nextInt();
        pswt.bayar = bayar;
       
        System.out.println();
        pswt.kembalian();
        while (pswt.bayar < pswt.tagihan){
            System.out.println("Uang yang anda masukkan kurang");
            System.out.println("Masukan uang kembali...");
            int tambahan = scan.nextInt();
            pswt.bayar = bayar + tambahan;
           
            pswt.kembalian();
           
        }
        System.out.print("kembalian anda sebesar Rp. "+pswt.kembali);
        System.out.println();
        System.out.println();
       
        System.out.println("TERIMA KASIH");
           
         for (int i = 0; i < 12; i++){
            System.out.print("=");
        }
        System.out.println();
       
                 
                 }
             }
