/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_akhir_pbo;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Transaksi {
    String idTransaksi;
    Pelanggan pelanggan;
    Berbiaya [] daftarBiaya;
    int komponenKe;
    double totalBiaya;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, int komponenKe) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        daftarBiaya = new Berbiaya[komponenKe];
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void addKomponenBiaya(Berbiaya biaya){
        daftarBiaya[komponenKe] = biaya;
        totalBiaya = totalBiaya + biaya.getBiaya();
        komponenKe++;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void printTransaksi(){
        System.out.println("Online Shop \"Yogya on Line\"  ");
        System.out.println("=========================== \n");
        System.out.println("Id Trans. : " + getIdTransaksi());
        System.out.println("Pelanggan : " + pelanggan.toString());
        System.out.println("--------------------------- Detail Biaya ---------------------------");
        System.out.println("No        Item      Nama         @Rp.            Jml            Total Rp.   ");
        for(int i = 0; i < komponenKe; i++){
            System.out.println(i + daftarBiaya[i].toString());
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Total Biaya : Rp." + totalBiaya);
    }

    @Override
    public String toString() {
        return Arrays.toString(daftarBiaya);
    }
}
