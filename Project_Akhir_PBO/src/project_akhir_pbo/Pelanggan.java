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
public class Pelanggan {
    String nama;
    public Pelanggan() {
    }

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}
