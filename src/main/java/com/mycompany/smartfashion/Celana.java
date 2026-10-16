
package com.mycompany.smartfashion;

public class Celana extends Produk implements DapatDiskon {

    private String ukuran;
    private String jenisCelana;

    public Celana(String kodeProduk, String namaProduk,
                  double harga, int stok,
                  String ukuran, String jenisCelana) {

        super(kodeProduk, namaProduk, harga, stok);
        this.ukuran = ukuran;
        this.jenisCelana = jenisCelana;
    }

    // Getter dan Setter Ukuran
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        if (ukuran != null && !ukuran.trim().isEmpty()) {
            this.ukuran = ukuran;
        } else {
            System.out.println("Ukuran celana tidak boleh kosong.");
        }
    }

    // Getter dan Setter Jenis Celana
    public String getJenisCelana() {
        return jenisCelana;
    }

    public void setJenisCelana(String jenisCelana) {
        if (jenisCelana != null && !jenisCelana.trim().isEmpty()) {
            this.jenisCelana = jenisCelana;
        } else {
            System.out.println("Jenis celana tidak boleh kosong.");
        }
    }

    // Override abstract method dari Produk
    @Override
    public void tampilkanDetailKhusus() {
        System.out.println("Jenis Produk: Celana");
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Jenis Celana: " + jenisCelana);
    }

    // Implementasi interface DapatDiskon
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.05;
    }
}
