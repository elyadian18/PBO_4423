package pratikum6;

import java.util.Scanner;

public class hijab {
    String nama;
    hijab next;
    public static Scanner in;
    public static Scanner str;

    public hijab() {
    }

    public void input() {
        System.out.print("Masukkan Nama Hijab        : ");
        this.nama = str.nextLine();
        this.next = null;
    }

    public void view() {
        System.out.println("Stock Hijab        : " + this.nama);
    }

    public static void main(String[] args) {
        int menu = 0;

        for(stack st = new stack(); menu != 5; System.out.println(" ")) {
            System.out.print("1.Tambahkan stock hijab (push)\n2.Hapus stock hijab (pop)\n3.Lihat Stock (view)\n4.Cek Stock (isEmpty)\n5.Exit\n : ");
            menu = in.nextInt();
            if (menu == 1) {
                hijab baru = new hijab();
                baru.input();
                st.push(baru);
            } else if (menu == 2) {
                st.pop();
            } else if (menu == 3) {
                st.view();
            } else if (menu == 4) {
                st.isEmpty();
            } else if (menu == 5) {
                System.out.println("keluar . . .");
            } else {
                System.out.println("salah . . .");
            }
        }

    }

    static {
        in = new Scanner(System.in);
        str = new Scanner(System.in);
    }
}
