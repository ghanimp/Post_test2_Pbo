package com.mycompany.post_test1;

import java.util.Scanner;
import service.PemainService;

public class Post_test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PemainService service = new PemainService();
        int choice;

        do {
            System.out.println("=== Sistem Manajemen Pemain Bola Liga Inggris ===");
            System.out.println("1. Tambah Pemain");
            System.out.println("2. Lihat Daftar Pemain");
            System.out.println("3. Update Pemain");
            System.out.println("4. Hapus Pemain");
            System.out.println("5. Cari Pemain");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    service.tambahPemain();
                    break;
                case 2:
                    service.tampilkanPemain();
                    break;
                case 3:
                    service.updatePemain();
                    break;
                case 4:
                    service.hapusPemain();
                    break;
                case 5:
                    service.cariPemain();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (choice != 0);

        input.close();
    }
}