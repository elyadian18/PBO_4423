package pratikum5;
import java.util.Scanner;

public class mainPBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan total inputan : ");
        int tot = input.nextInt();
        int[] nilai = new int[tot];
        for(int i = 0; i < tot; i++){
            System.out.print("Masukan nilai : ");
            nilai[i] = input.nextInt();
        }
        nilaiPBO tampil = new nilaiPBO();
        tampil.daftarNilai(nilai,tot);
    }
}
