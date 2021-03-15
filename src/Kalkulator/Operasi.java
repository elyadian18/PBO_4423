package Operasi;

public class Operasi {
    int angkaPertama;
    int angkaKedua;

    public Operasi(int angkaPertama, int angkaKedua) {
        this.angkaPertama = angkaPertama;
        this.angkaKedua = angkaKedua;
    }
    public int tambah() {

        return this.angkaPertama + this.angkaKedua;
    }
    public int bagi() {

        return this.angkaPertama / this.angkaKedua;
    }
    public int kurang() {
        return this.angkaPertama - this.angkaKedua;
    }
    public int kali() {

        return this.angkaPertama * this.angkaKedua;
    }
    public int mod() {

        return this.angkaPertama % this.angkaKedua;
    }
}