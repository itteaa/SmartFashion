package com.mycompany.smartfashion;

public class Produk {

    // ==============================
    // FIELD / ATRIBUT
    // Encapsulation menggunakan private
    // ==============================

    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Static untuk menghitung total objek Produk
    private static int totalProduk = 0;

    // ==============================
    // CONSTRUCTOR
    // ==============================

    public Produk(String kodeProduk, String namaProduk,
                  double harga, int stok) {

        // penggunaan keyword this
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;

        // static counter
        totalProduk++;
    }

    // ==============================
    // GETTER
    // ==============================

    public String getKodeProduk() {
        return this.kodeProduk;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public double getHarga() {
        return this.harga;
    }

    public int getStok() {
        return this.stok;
    }

    // ==============================
    // SETTER + VALIDASI
    // ==============================

    public void setKodeProduk(String kodeProduk) {

        if (kodeProduk != null && !kodeProduk.trim().isEmpty()) {
            this.kodeProduk = kodeProduk;
        } else {
            System.out.println("Kode produk tidak boleh kosong.");
        }
    }

    public void setNamaProduk(String namaProduk) {

        if (namaProduk != null && !namaProduk.trim().isEmpty()) {
            this.namaProduk = namaProduk;
        } else {
            System.out.println("Nama produk tidak boleh kosong.");
        }
    }

    public void setHarga(double harga) {

        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif.");
        }
    }

    public void setStok(int stok) {

        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif.");
        }
    }

    // ==============================
    // STATIC METHOD
    // ==============================

    public static int getTotalProduk() {
        return totalProduk;
    }

    // ==============================
    // METHOD
    // ==============================

    public void tampilkanInfo() {

        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.printf("Harga       : Rp%,.0f%n", harga);
        System.out.println("Stok        : " + stok);
    }

    // ==============================
    // METHOD OVERLOADING
    // ==============================

    // Pencarian berdasarkan nama
    public boolean cariProduk(String nama) {

        return this.namaProduk.equalsIgnoreCase(nama);
    }

    // Pencarian berdasarkan harga
    public boolean cariProduk(double harga) {

        return this.harga == harga;
    }
}