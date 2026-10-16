
package com.mycompany.smartfashion;

public class Dress extends Produk implements DapatDitukar {

    private String ukuran;
    private String modelDress;

    public Dress(String kodeProduk, String namaProduk,
                 double harga, int stok,
                 String ukuran, String modelDress) {

        super(kodeProduk, namaProduk, harga, stok);
        this.ukuran = ukuran;
        this.modelDress = modelDress;
    }

    // Getter dan Setter Ukuran
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        if (ukuran != null && !ukuran.trim().isEmpty()) {
            this.ukuran = ukuran;
        } else {
            System.out.println("Ukuran dress tidak boleh kosong.");
        }
    }

    // Getter dan Setter Model Dress
    public String getModelDress() {
        return modelDress;
    }

    public void setModelDress(String modelDress) {
        if (modelDress != null && !modelDress.trim().isEmpty()) {
            this.modelDress = modelDress;
        } else {
            System.out.println("Model dress tidak boleh kosong.");
        }
    }

    // Override abstract method dari Produk
    @Override
    public void tampilkanDetailKhusus() {
        System.out.println("Jenis Produk: Dress");
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Model Dress : " + modelDress);
    }

    // Implementasi interface DapatDitukar
    @Override
    public void prosesPenukaran() {
        System.out.println("Penukaran dress dapat diproses.");
        System.out.println("Produk: " + getNamaProduk());
        System.out.println(
                "Silakan ikuti ketentuan penukaran toko."
        );
    }
}
