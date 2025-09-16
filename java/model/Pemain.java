package model;

public class Pemain {
    private String nama;
    private String klub;
    private String posisi;
    private int nomorPunggung;
    private int usia;

    public Pemain(String nama, String klub, String posisi, int nomorPunggung, int usia) {
        this.nama = nama;
        this.klub = klub;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getNomorPunggung() {
        return nomorPunggung;
    }

    public void setNomorPunggung(int nomorPunggung) {
        this.nomorPunggung = nomorPunggung;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + " | Klub: " + klub + " | Posisi: " + posisi + 
               " | Nomor: " + nomorPunggung + " | Usia: " + usia;
    }
}