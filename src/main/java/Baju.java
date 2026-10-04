package com.mycompany.smartfashion;

public class Baju extends Produk {

    // Field khusus Baju
    private String ukuran;
    private String jenisBaju;

    // ==============================
    // CONSTRUCTOR
    // ==============================

    public Baju(String kodeProduk, String namaProduk,
                double harga, int stok,
                String ukuran, String jenisBaju) {

        // Memanggil constructor superclass
        super(kodeProduk, namaProduk, harga, stok);

        // penggunaan this
        this.ukuran = ukuran;
        this.jenisBaju = jenisBaju;
    }

    // ==============================
    // GETTER
    // ==============================

    public String getUkuran() {
        return this.ukuran;
    }

    public String getJenisBaju() {
        return this.jenisBaju;
    }

    // ==============================
    // SETTER + VALIDASI
    // ==============================

    public void setUkuran(String ukuran) {

        if (ukuran != null && !ukuran.trim().isEmpty()) {
            this.ukuran = ukuran;
        } else {
            System.out.println("Ukuran baju tidak boleh kosong.");
        }
    }

    public void setJenisBaju(String jenisBaju) {

        if (jenisBaju != null && !jenisBaju.trim().isEmpty()) {
            this.jenisBaju = jenisBaju;
        } else {
            System.out.println("Jenis baju tidak boleh kosong.");
        }
    }

    // ==============================
    // METHOD OVERRIDING
    // ==============================

    @Override
    public void tampilkanInfo() {

        // Memanggil method milik superclass
        super.tampilkanInfo();

        System.out.println("Jenis Produk: Baju");
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Jenis Baju  : " + jenisBaju);
    }
}