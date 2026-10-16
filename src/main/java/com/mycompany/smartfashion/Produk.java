
package com.mycompany.smartfashion;

import java.util.Locale;

public abstract class Produk {

    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    private static int totalProduk = 0;

    public Produk(String kodeProduk, String namaProduk,
                  double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        totalProduk++;
    }

    // Getter dan Setter Kode Produk
    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        if (kodeProduk != null && !kodeProduk.trim().isEmpty()) {
            this.kodeProduk = kodeProduk;
        } else {
            System.out.println("Kode produk tidak boleh kosong.");
        }
    }

    // Getter dan Setter Nama Produk
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        if (namaProduk != null && !namaProduk.trim().isEmpty()) {
            this.namaProduk = namaProduk;
        } else {
            System.out.println("Nama produk tidak boleh kosong.");
        }
    }

    // Getter dan Setter Harga
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif.");
        }
    }

    // Getter dan Setter Stok
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif.");
        }
    }

    // Menghitung jumlah objek produk
    public static int getTotalProduk() {
        return totalProduk;
    }

    // Abstract method yang wajib di-override
    // oleh setiap subclass
    public abstract void tampilkanDetailKhusus();

    // Menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        : " + stok);

        tampilkanDetailKhusus();
    }

    // Method overloading untuk mencari produk
    public boolean cariProduk(String nama) {
        return namaProduk.toLowerCase(Locale.ROOT)
                .contains(nama.toLowerCase(Locale.ROOT));
    }

    public boolean cariProduk(double harga) {
        return this.harga == harga;
    }
}
