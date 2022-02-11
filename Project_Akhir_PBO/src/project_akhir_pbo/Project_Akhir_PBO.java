package project_akhir_pbo;
public class Project_Akhir_PBO {
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("Life For Coding");

        Barang b11 = new Barang("Baju", 8000, 4);

        Barang b12 = new Barang("Sandal", 5000, 3);

        JasaKurir j1 = new Standart("Std001", 2);

        Transaksi t1 = new Transaksi("205314020", p1, 10);

        t1.addKomponenBiaya(b11);

        t1.addKomponenBiaya(b12);

        t1.addKomponenBiaya(j1);

        t1.printTransaksi();
    }
    
}
