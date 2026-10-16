
package com.mycompany.smartfashion;

import java.util.Scanner;

public class SmartFashion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produk[] daftarProduk = new Produk[20];
        int jumlahProduk = 0;
        boolean isRunning = true;

        // DATA AWAL PRODUK
        daftarProduk[jumlahProduk++] = new Baju(
                "BJ001", "Kaos Oversize", 85000, 10, "L", "Kaos");

        daftarProduk[jumlahProduk++] = new Baju(
                "BJ002", "Kemeja Linen", 150000, 8, "M", "Kemeja");

        daftarProduk[jumlahProduk++] = new Baju(
                "BJ003", "Hoodie Basic", 180000, 6, "XL", "Hoodie");

        daftarProduk[jumlahProduk++] = new Celana(
                "CL001", "Jeans Regular", 220000, 7, "32", "Jeans");

        daftarProduk[jumlahProduk++] = new Celana(
                "CL002", "Cargo Pants", 195000, 5, "30", "Cargo");

        daftarProduk[jumlahProduk++] = new Dress(
                "DR001", "Dress Floral", 275000, 6, "M", "Floral");

        do {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("                 SMARTFASHION");
            System.out.println("           SISTEM DATA PRODUK FASHION");
            System.out.println("==============================================");
            System.out.println("1. Tambah Data Baru");
            System.out.println("2. Tampilkan Seluruh Data");
            System.out.println("3. Pencarian / Aksi Interface");
            System.out.println("4. Keluar");
            System.out.println("==============================================");
            System.out.print("Pilih menu: ");

            int pilihan;

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Masukkan angka yang valid!");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {

                // MENU 1: TAMBAH PRODUK
                case 1:
                    if (jumlahProduk >= daftarProduk.length) {
                        System.out.println("Data produk sudah penuh!");
                        break;
                    }

                    System.out.println("\n--- TAMBAH DATA PRODUK ---");
                    System.out.println("1. Baju");
                    System.out.println("2. Celana");
                    System.out.println("3. Dress");
                    System.out.print("Pilih jenis produk: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Pilihan harus berupa angka!");
                        scanner.nextLine();
                        break;
                    }

                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    if (jenis < 1 || jenis > 3) {
                        System.out.println("Jenis produk tidak tersedia!");
                        break;
                    }

                    System.out.print("Kode produk: ");
                    String kode = scanner.nextLine();

                    System.out.print("Nama produk: ");
                    String nama = scanner.nextLine();

                    System.out.print("Harga: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Harga harus berupa angka!");
                        scanner.nextLine();
                        break;
                    }
                    double harga = scanner.nextDouble();

                    System.out.print("Stok: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Stok harus berupa angka!");
                        scanner.nextLine();
                        break;
                    }
                    int stok = scanner.nextInt();
                    scanner.nextLine();

                    if (kode.trim().isEmpty()
                            || nama.trim().isEmpty()
                            || harga < 0 || stok < 0) {
                        System.out.println("Data produk tidak valid!");
                        break;
                    }

                    if (jenis == 1) {
                        System.out.print("Ukuran baju: ");
                        String ukuran = scanner.nextLine();

                        System.out.print("Jenis baju: ");
                        String jenisBaju = scanner.nextLine();

                        if (ukuran.trim().isEmpty()
                                || jenisBaju.trim().isEmpty()) {
                            System.out.println(
                                    "Ukuran dan jenis baju tidak boleh kosong!");
                            break;
                        }

                        daftarProduk[jumlahProduk++] = new Baju(
                                kode, nama, harga, stok, ukuran, jenisBaju);

                        System.out.println("Data baju berhasil ditambahkan!");

                    } else if (jenis == 2) {
                        System.out.print("Ukuran celana: ");
                        String ukuran = scanner.nextLine();

                        System.out.print("Jenis celana: ");
                        String jenisCelana = scanner.nextLine();

                        if (ukuran.trim().isEmpty()
                                || jenisCelana.trim().isEmpty()) {
                            System.out.println(
                                    "Ukuran dan jenis celana tidak boleh kosong!");
                            break;
                        }

                        daftarProduk[jumlahProduk++] = new Celana(
                                kode, nama, harga, stok, ukuran, jenisCelana);

                        System.out.println("Data celana berhasil ditambahkan!");

                    } else {
                        System.out.print("Ukuran dress: ");
                        String ukuran = scanner.nextLine();

                        System.out.print("Model dress: ");
                        String modelDress = scanner.nextLine();

                        if (ukuran.trim().isEmpty()
                                || modelDress.trim().isEmpty()) {
                            System.out.println(
                                    "Ukuran dan model dress tidak boleh kosong!");
                            break;
                        }

                        daftarProduk[jumlahProduk++] = new Dress(
                                kode, nama, harga, stok, ukuran, modelDress);

                        System.out.println("Data dress berhasil ditambahkan!");
                    }
                    break;

                // MENU 2: TAMPILKAN SELURUH PRODUK
                case 2:
                    System.out.println("\n--- DAFTAR PRODUK SMARTFASHION ---");

                    for (int i = 0; i < jumlahProduk; i++) {
                        System.out.println("\nData produk ke-" + (i + 1));
                        System.out.println("----------------------------------");

                        // Polymorphism dan abstract method
                        daftarProduk[i].tampilkanInfo();
                    }

                    System.out.println("----------------------------------");
                    System.out.println("Total produk: " + jumlahProduk);
                    System.out.println(
                            "Total objek dibuat: " + Produk.getTotalProduk());
                    break;

                // MENU 3: PENCARIAN DAN AKSI INTERFACE
                case 3:
                    System.out.println("\n--- PENCARIAN / AKSI INTERFACE ---");
                    System.out.println("1. Cari berdasarkan nama");
                    System.out.println("2. Cari berdasarkan harga");
                    System.out.println("3. Hitung diskon produk");
                    System.out.println("4. Proses penukaran produk");
                    System.out.print("Pilih proses: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Masukkan angka yang valid!");
                        scanner.nextLine();
                        break;
                    }

                    int aksi = scanner.nextInt();
                    scanner.nextLine();

                    // PENCARIAN BERDASARKAN NAMA
                    if (aksi == 1) {
                        System.out.print("Masukkan nama produk: ");
                        String namaCari = scanner.nextLine();
                        boolean ditemukan = false;

                        for (int i = 0; i < jumlahProduk; i++) {
                            if (daftarProduk[i].cariProduk(namaCari)) {
                                System.out.println("\nProduk ditemukan:");
                                daftarProduk[i].tampilkanInfo();
                                ditemukan = true;
                            }
                        }

                        if (!ditemukan) {
                            System.out.println("Produk tidak ditemukan.");
                        }

                    // PENCARIAN BERDASARKAN HARGA
                    } else if (aksi == 2) {
                        System.out.print("Masukkan harga produk: ");

                        if (!scanner.hasNextDouble()) {
                            System.out.println("Harga harus berupa angka!");
                            scanner.nextLine();
                            break;
                        }

                        double hargaCari = scanner.nextDouble();
                        scanner.nextLine();
                        boolean ditemukan = false;

                        for (int i = 0; i < jumlahProduk; i++) {
                            if (daftarProduk[i].cariProduk(hargaCari)) {
                                System.out.println("\nProduk ditemukan:");
                                daftarProduk[i].tampilkanInfo();
                                ditemukan = true;
                            }
                        }

                        if (!ditemukan) {
                            System.out.println("Produk tidak ditemukan.");
                        }

                    // AKSI INTERFACE: DISKON ATAU PENUKARAN
                    } else if (aksi == 3 || aksi == 4) {

                        if (jumlahProduk == 0) {
                            System.out.println("Belum ada produk.");
                            break;
                        }

                        System.out.println("\nPilih produk:");

                        for (int i = 0; i < jumlahProduk; i++) {
                            System.out.println(
                                    (i + 1) + ". "
                                    + daftarProduk[i].getNamaProduk()
                                    + " - Rp" + daftarProduk[i].getHarga());
                        }

                        System.out.print("Nomor produk: ");

                        if (!scanner.hasNextInt()) {
                            System.out.println("Masukkan angka yang valid!");
                            scanner.nextLine();
                            break;
                        }

                        int nomor = scanner.nextInt();
                        scanner.nextLine();

                        if (nomor < 1 || nomor > jumlahProduk) {
                            System.out.println("Nomor produk tidak valid!");
                            break;
                        }

                        Produk produk = daftarProduk[nomor - 1];

                        if (aksi == 3) {

                            // instanceof sebelum memanggil interface
                            if (produk instanceof DapatDiskon) {
                                DapatDiskon diskon =
                                        (DapatDiskon) produk;

                                double jumlahDiskon =
                                        diskon.hitungDiskon();

                                System.out.println("\n--- INFORMASI DISKON ---");
                                System.out.println(
                                        "Nama produk: "
                                        + produk.getNamaProduk());
                                System.out.println(
                                        "Harga awal: Rp"
                                        + produk.getHarga());
                                System.out.println(
                                        "Diskon: Rp" + jumlahDiskon);
                                System.out.println(
                                        "Harga setelah diskon: Rp"
                                        + (produk.getHarga() - jumlahDiskon));
                            } else {
                                System.out.println(
                                        "Produk ini tidak memiliki fitur diskon.");
                            }

                        } else {

                            // instanceof sebelum memanggil interface
                            if (produk instanceof DapatDitukar) {
                                DapatDitukar tukar =
                                        (DapatDitukar) produk;

                                tukar.prosesPenukaran();
                            } else {
                                System.out.println(
                                        "Produk ini tidak memiliki fitur penukaran.");
                            }
                        }

                    } else {
                        System.out.println("Pilihan tidak tersedia!");
                    }
                    break;

                // MENU 4: KELUAR
                case 4:
                    isRunning = false;
                    System.out.println(
                            "\nTerima kasih telah menggunakan SmartFashion!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia!");
                    break;
            }

        } while (isRunning);

        scanner.close();
    }
}
