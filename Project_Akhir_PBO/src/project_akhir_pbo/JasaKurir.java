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
public abstract class JasaKurir implements Berbiaya{
    String idPengiriman;
    double berat;

    public JasaKurir(String idPengiriman, double berat) {
        this.idPengiriman = idPengiriman;
        this.berat = berat;
    }

    @Override
    public double getBiaya() {
        return 0;
    }
}
