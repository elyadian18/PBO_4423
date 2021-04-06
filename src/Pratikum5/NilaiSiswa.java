package Praktikum5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args){
        Scanner jmlData = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");

        int angka = jmlData.nextInt();

        ArrayList<Siswa> students = new ArrayList<Siswa>();
        for (int i=1; i<=angka; i++){
            Scanner nim = new Scanner(System.in);
            System.out.print("masukkan nim : ");
            String Nim = nim.nextLine();

            Scanner nama = new Scanner(System.in);
            System.out.print("masukkan nama : ");
            String Nama = nama.nextLine();

            Scanner nilaiteori = new Scanner(System.in);
            System.out.print("masukkan nilai teori : ");
            int NilaiTeori = nilaiteori.nextInt();

            Scanner nilaipraktek = new Scanner(System.in);
            System.out.print("masukkan nilai praktek : ");
            int NilaiPraktek = nilaipraktek.nextInt();

            Siswa items = new Siswa(Nim, Nama, NilaiTeori, NilaiPraktek);
            students.add(items);
        }

        System.out.println("\nDaftar nilai siswa");
        System.out.println();
        for(Siswa student: students){
            System.out.printf("NIM    : %s\n",student.getNim());
            System.out.printf("Nama    : %s\n",student.getNama());
            System.out.printf("Nilai Teori    : %s\n",student.getNilaiTeori());
            System.out.printf("Nilai Praktel    : %s\n",student.getNilaiPraktek());
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
}
