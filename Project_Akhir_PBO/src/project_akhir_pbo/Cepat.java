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
public class Cepat extends JasaKurir{
    private double CEPAT_PER_KILO = 10000;

    public Cepat(String idPengiriman, double berat) {
        super(idPengiriman, berat);
    }

    @Override
    public double getBiaya() {
        return super.getBiaya();
    }
}
