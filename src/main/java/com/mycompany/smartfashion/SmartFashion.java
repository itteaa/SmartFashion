package com.mycompany.smartfashion;

import java.util.Scanner;

public class SmartFashion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // ARRAY UNTUK MENYIMPAN OBJECT PRODUK
        // ==========================================

        Produk[] daftarProduk = new Produk[20];

        int jumlahProduk = 0;
        boolean isRunning = true;

        // ==========================================
        // DATA AWAL
        // 5 OBJECT
        // ==========================================

        daftarProduk[jumlahProduk++] = new Baju(
                "BJ001",
                "Kaos Oversize",
                85000,
                10,
                "L",
                "Kaos"
        );

        daftarProduk[jumlahProduk++] = new Baju(
                "BJ002",
                "Kemeja Linen",
                150000,
                8,
                "M",
                "Kemeja"
        );

        daftarProduk[jumlahProduk++] = new Baju(
                "BJ003",
                "Hoodie Basic",
                180000,
                6,
                "XL",
                "Hoodie"
        );

        daftarProduk[jumlahProduk++] = new Celana(
                "CL001",
                "Jeans Regular",
                220000,
                7,
                "32",
                "Jeans"
        );

        daftarProduk[jumlahProduk++] = new Celana(
                "CL002",
                "Cargo Pants",
                195000,
                5,
                "30",
                "Cargo"
        );

        // ==========================================
        // PROGRAM UTAMA
        // DO-WHILE
        // ==========================================

        do {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("              SMARTFASHION");
            System.out.println("        SISTEM DATA PRODUK FASHION");
            System.out.println("==============================================");
            System.out.println("1. Tambah Data Baru");
            System.out.println("2. Tampilkan Seluruh Data");
            System.out.println("3. Pencarian / Aksi Khusus");
            System.out.println("4. Keluar");
            System.out.println("==============================================");

            System.out.print("Pilih menu : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            // ======================================
            // SWITCH-CASE
            // ======================================

            switch (pilihan) {

                // ==================================
                // CASE 1
                // TAMBAH DATA
                // ==================================

                case 1:

                    if (jumlahProduk >= daftarProduk.length) {

                        System.out.println(
                                "Data produk sudah penuh!"
                        );

                    } else {

                        System.out.println();
                        System.out.println("----------------------------------------------");
                        System.out.println("           TAMBAH DATA PRODUK");
                        System.out.println("----------------------------------------------");

                        System.out.println("1. Baju");
                        System.out.println("2. Celana");

                        System.out.print("Pilih jenis produk : ");
                        int jenis = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Kode Produk : ");
                        String kode = scanner.nextLine();

                        System.out.print("Nama Produk : ");
                        String nama = scanner.nextLine();

                        System.out.print("Harga       : ");
                        double harga = scanner.nextDouble();

                        System.out.print("Stok        : ");
                        int stok = scanner.nextInt();
                        scanner.nextLine();

                        // ==================================
                        // IF-ELSE
                        // VALIDASI HARGA DAN STOK
                        // ==================================

                        if (harga < 0 || stok < 0) {

                            System.out.println(
                                    "Harga dan stok tidak boleh negatif!"
                            );

                        } else if (jenis == 1) {

                            System.out.print("Ukuran Baju : ");
                            String ukuran = scanner.nextLine();

                            System.out.print("Jenis Baju  : ");
                            String jenisBaju = scanner.nextLine();

                            daftarProduk[jumlahProduk] =
                                    new Baju(
                                            kode,
                                            nama,
                                            harga,
                                            stok,
                                            ukuran,
                                            jenisBaju
                                    );

                            jumlahProduk++;

                            System.out.println();
                            System.out.println(
                                    "Data Baju berhasil ditambahkan!"
                            );

                        } else if (jenis == 2) {

                            System.out.print("Ukuran Celana : ");
                            String ukuran = scanner.nextLine();

                            System.out.print("Jenis Celana  : ");
                            String jenisCelana = scanner.nextLine();

                            daftarProduk[jumlahProduk] =
                                    new Celana(
                                            kode,
                                            nama,
                                            harga,
                                            stok,
                                            ukuran,
                                            jenisCelana
                                    );

                            jumlahProduk++;

                            System.out.println();
                            System.out.println(
                                    "Data Celana berhasil ditambahkan!"
                            );

                        } else {

                            System.out.println(
                                    "Jenis produk tidak tersedia!"
                            );
                        }
                    }

                    break;

                // ==================================
                // CASE 2
                // TAMPILKAN DATA
                // ==================================

                case 2:

                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("           DAFTAR PRODUK SMARTFASHION");
                    System.out.println("==============================================");

                    if (jumlahProduk == 0) {

                        System.out.println(
                                "Belum ada data produk."
                        );

                    } else {

                        for (int i = 0; i < jumlahProduk; i++) {

                            System.out.println();
                            System.out.println(
                                    "Data Produk ke-" + (i + 1)
                            );

                            System.out.println(
                                    "----------------------------------------------"
                            );

                            daftarProduk[i].tampilkanInfo();

                            System.out.println(
                                    "----------------------------------------------"
                            );
                        }

                        System.out.println();
                        System.out.println(
                                "Total produk berhasil dibuat : "
                                + Produk.getTotalProduk()
                        );
                    }

                    break;

                // ==================================
                // CASE 3
                // PENCARIAN / AKSI KHUSUS
                // METHOD OVERLOADING
                // ==================================

                case 3:

                    System.out.println();
                    System.out.println("----------------------------------------------");
                    System.out.println("        PENCARIAN / AKSI KHUSUS");
                    System.out.println("----------------------------------------------");

                    System.out.println("1. Cari berdasarkan nama");
                    System.out.println("2. Cari berdasarkan harga");

                    System.out.print("Pilih pencarian : ");
                    int cari = scanner.nextInt();
                    scanner.nextLine();

                    // ==================================
                    // PENCARIAN BERDASARKAN NAMA
                    // ==================================

                    if (cari == 1) {

                        System.out.print(
                                "Masukkan nama produk : "
                        );

                        String namaCari = scanner.nextLine();

                        boolean ditemukan = false;

                        for (int i = 0; i < jumlahProduk; i++) {

                            if (daftarProduk[i]
                                    .cariProduk(namaCari)) {

                                System.out.println();
                                System.out.println(
                                        "Produk ditemukan!"
                                );

                                System.out.println(
                                        "----------------------------------------------"
                                );

                                daftarProduk[i].tampilkanInfo();

                                System.out.println(
                                        "----------------------------------------------"
                                );

                                ditemukan = true;
                            }
                        }

                        if (!ditemukan) {

                            System.out.println(
                                    "Produk dengan nama tersebut tidak ditemukan."
                            );
                        }

                    // ==================================
                    // PENCARIAN BERDASARKAN HARGA
                    // ==================================

                    } else if (cari == 2) {

                        System.out.print(
                                "Masukkan harga produk : "
                        );

                        double hargaCari = scanner.nextDouble();

                        boolean ditemukan = false;

                        for (int i = 0; i < jumlahProduk; i++) {

                            if (daftarProduk[i]
                                    .cariProduk(hargaCari)) {

                                System.out.println();
                                System.out.println(
                                        "Produk ditemukan!"
                                );

                                System.out.println(
                                        "----------------------------------------------"
                                );

                                daftarProduk[i].tampilkanInfo();

                                System.out.println(
                                        "----------------------------------------------"
                                );

                                ditemukan = true;
                            }
                        }

                        if (!ditemukan) {

                            System.out.println(
                                    "Produk dengan harga tersebut tidak ditemukan."
                            );
                        }

                    } else {

                        System.out.println(
                                "Pilihan pencarian tidak tersedia."
                        );
                    }

                    break;

                // ==================================
                // CASE 4
                // KELUAR
                // ==================================

                case 4:

                    isRunning = false;

                    System.out.println();
                    System.out.println(
                            "=============================================="
                    );

                    System.out.println(
                            "Terima kasih telah menggunakan SmartFashion!"
                    );

                    System.out.println(
                            "=============================================="
                    );

                    break;

                // ==================================
                // DEFAULT
                // ==================================

                default:

                    System.out.println();
                    System.out.println(
                            "Pilihan menu tidak tersedia!"
                    );

                    break;
            }

        } while (isRunning);

        scanner.close();
    }
}