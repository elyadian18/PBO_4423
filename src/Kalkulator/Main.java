package Operasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runOperasi();
    }
    public static void runOperasi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---Kalkulator Sederhana--- \n");
        System.out.print("Masukan angka pertama : ");
        int angkaPertama = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int angkaKedua = scanner.nextInt();

        Operasi Kalkulator = new Operasi(angkaPertama, angkaKedua);
        System.out.println(angkaPertama + " + " + angkaKedua + " = " + Kalkulator.tambah());
        System.out.println(angkaPertama + " / " + angkaKedua + " = " + Kalkulator.bagi());
        System.out.println(angkaPertama + " - " + angkaKedua + " = " + Kalkulator.kurang());
        System.out.println(angkaPertama + " x " + angkaKedua + " = " + Kalkulator.kali());
        System.out.println(angkaPertama + " % " + angkaKedua + " = " + Kalkulator.mod());
    }
}