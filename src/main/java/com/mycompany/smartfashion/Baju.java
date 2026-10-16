
package com.mycompany.smartfashion;

public class Baju extends Produk
        implements DapatDiskon, DapatDitukar {

    private String ukuran;
    private String jenisBaju;

    public Baju(String kodeProduk, String namaProduk,
                double harga, int stok,
                String ukuran, String jenisBaju) {

        super(kodeProduk, namaProduk, harga, stok);
        this.ukuran = ukuran;
        this.jenisBaju = jenisBaju;
    }

    // Getter dan Setter Ukuran
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        if (ukuran != null && !ukuran.trim().isEmpty()) {
            this.ukuran = ukuran;
        } else {
            System.out.println("Ukuran baju tidak boleh kosong.");
        }
    }

    // Getter dan Setter Jenis Baju
    public String getJenisBaju() {
        return jenisBaju;
    }

    public void setJenisBaju(String jenisBaju) {
        if (jenisBaju != null && !jenisBaju.trim().isEmpty()) {
            this.jenisBaju = jenisBaju;
        } else {
            System.out.println("Jenis baju tidak boleh kosong.");
        }
    }

    // Override abstract method dari Produk
    @Override
    public void tampilkanDetailKhusus() {
        System.out.println("Jenis Produk: Baju");
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Jenis Baju  : " + jenisBaju);
    }

    // Implementasi interface DapatDiskon
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.10;
    }

    // Implementasi interface DapatDitukar
    @Override
    public void prosesPenukaran() {
        System.out.println("Penukaran baju dapat diproses.");
        System.out.println("Produk: " + getNamaProduk());
        System.out.println(
                "Silakan ikuti ketentuan penukaran toko."
        );
    }
}
