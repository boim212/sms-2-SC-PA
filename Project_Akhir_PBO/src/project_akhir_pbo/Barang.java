/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_akhir_pbo;

/**
 *
 * @author ASUS
 */
public class Barang implements Berbiaya{
    String nama;
    double harga,jumlah;

    public Barang(String nama, double harga, double jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }


    @Override
    public double getBiaya() {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return "       [Barang]   " + nama + "          " + harga + "          " + jumlah +"              "+ getBiaya();
    }
}
