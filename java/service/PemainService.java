package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Pemain;

public class PemainService {
    private ArrayList<Pemain> pemainList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahPemain() {
        System.out.print("Masukkan Nama Pemain: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nama Klub: ");
        String klub = input.nextLine();

        System.out.print("Masukkan Posisi Pemain: ");
        String posisi = input.nextLine();

        int nomorPunggung;
        while (true) {
            System.out.print("Masukkan Nomor Punggung: ");
            try {
                nomorPunggung = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nomor punggung harus angka!");
            }
        }

        int usia;
        while (true) {
            System.out.print("Masukkan Usia Pemain: ");
            try {
                usia = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Usia harus angka!");
            }
        }

        pemainList.add(new Pemain(nama, klub, posisi, nomorPunggung, usia));
        System.out.println("Pemain berhasil ditambahkan!\n");
    }

    public void tampilkanPemain() {
        if (pemainList.isEmpty()) {
            System.out.println("Belum ada data pemain.\n");
            return;
        }
        System.out.println("=== DAFTAR PEMAIN ===");
        int i = 1;
        for (Pemain p : pemainList) {
            System.out.println(i + ". " + p);
            i++;
        }
        System.out.println();
    }

    public void updatePemain() {
        if (pemainList.isEmpty()) {
            System.out.println("Belum ada data pemain.\n");
            return;
        }

        System.out.print("Masukkan nama pemain yang akan diupdate: ");
        String namaCari = input.nextLine().toLowerCase();

        Pemain p = null;
        for (Pemain pemain : pemainList) {
            if (pemain.getNama().toLowerCase().equals(namaCari)) {
                p = pemain;
                break;
            }
        }

        if (p != null) {
            System.out.print("Nama Baru (" + p.getNama() + "): ");
            String nama = input.nextLine();
            if (!nama.isEmpty()) p.setNama(nama);

            System.out.print("Klub Baru (" + p.getKlub() + "): ");
            String klub = input.nextLine();
            if (!klub.isEmpty()) p.setKlub(klub);

            System.out.print("Posisi Baru (" + p.getPosisi() + "): ");
            String posisi = input.nextLine();
            if (!posisi.isEmpty()) p.setPosisi(posisi);

            System.out.print("Nomor Punggung Baru (" + p.getNomorPunggung() + "): ");
            String num = input.nextLine();
            if (!num.isEmpty()) p.setNomorPunggung(Integer.parseInt(num));

            System.out.print("Usia Baru (" + p.getUsia() + "): ");
            String usia = input.nextLine();
            if (!usia.isEmpty()) p.setUsia(Integer.parseInt(usia));

            System.out.println("Data pemain berhasil diupdate!\n");
        } else {
            System.out.println("Pemain dengan nama tersebut tidak ditemukan.\n");
        }
    }

    public void hapusPemain() {
        if (pemainList.isEmpty()) {
            System.out.println("Belum ada data pemain.\n");
            return;
        }

        System.out.print("Masukkan nama pemain yang akan dihapus: ");
        String namaCari = input.nextLine().toLowerCase();

        Pemain p = null;
        for (Pemain pemain : pemainList) {
            if (pemain.getNama().toLowerCase().equals(namaCari)) {
                p = pemain;
                break;
            }
        }

        if (p != null) {
            pemainList.remove(p);
            System.out.println("Pemain berhasil dihapus!\n");
        } else {
            System.out.println("Pemain dengan nama tersebut tidak ditemukan.\n");
        }
    }

    public void cariPemain() {
        if (pemainList.isEmpty()) {
            System.out.println("Belum ada data pemain.\n");
            return;
        }

        System.out.print("\nMasukkan nama pemain yang dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean found = false;
        for (Pemain p : pemainList) {
            if (p.getNama().toLowerCase().contains(keyword)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("\nPemain tidak ditemukan.\n");
        } else {
            System.out.println();
        }
    }
}