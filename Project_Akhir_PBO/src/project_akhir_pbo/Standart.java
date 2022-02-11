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
public class Standart extends JasaKurir{
    private final double STANDART_PER_KILO = 5000;

    public Standart(String idPengiriman, double berat) {
        super(idPengiriman, berat);
    }

    @Override
    public double getBiaya() {
        return berat *  STANDART_PER_KILO;
    }

    @Override
    public String toString() {
        return "       [Ex Std]   " +  idPengiriman +"       "+ STANDART_PER_KILO + "           "+berat +"             "+ getBiaya();
    }
}
