package com.mycompany.smartfashion;

public class Celana extends Produk {

    // Field khusus Celana
    private String ukuran;
    private String jenisCelana;

    // ==============================
    // CONSTRUCTOR
    // ==============================

    public Celana(String kodeProduk, String namaProduk,
                  double harga, int stok,
                  String ukuran, String jenisCelana) {

        // Memanggil constructor superclass
        super(kodeProduk, namaProduk, harga, stok);

        // penggunaan this
        this.ukuran = ukuran;
        this.jenisCelana = jenisCelana;
    }

    // ==============================
    // GETTER
    // ==============================

    public String getUkuran() {
        return this.ukuran;
    }

    public String getJenisCelana() {
        return this.jenisCelana;
    }

    // ==============================
    // SETTER + VALIDASI
    // ==============================

    public void setUkuran(String ukuran) {

        if (ukuran != null && !ukuran.trim().isEmpty()) {
            this.ukuran = ukuran;
        } else {
            System.out.println("Ukuran celana tidak boleh kosong.");
        }
    }

    public void setJenisCelana(String jenisCelana) {

        if (jenisCelana != null && !jenisCelana.trim().isEmpty()) {
            this.jenisCelana = jenisCelana;
        } else {
            System.out.println("Jenis celana tidak boleh kosong.");
        }
    }

    // ==============================
    // METHOD OVERRIDING
    // ==============================

    @Override
    public void tampilkanInfo() {

        // Memanggil method superclass
        super.tampilkanInfo();

        System.out.println("Jenis Produk: Celana");
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Jenis Celana: " + jenisCelana);
    }
}