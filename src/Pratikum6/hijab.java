/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class hijab {
    String nama;
    hijab next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Nama Hijab        : ");
        nama=str.nextLine();
        next=null;
    }
    public void view(){
        System.out.println("Stock Hijab        : "+nama);
    }
    public static void main(String[] args) {
        int menu=0;
        stack st=new stack();
        while(menu!=5){
            System.out.print("1.Tambahkan stock hijab (push)\n2.Hapus stock hijab (pop)\n3.Lihat Stock (view)\n4.Cek Stock (isEmpty)\n5.Exit\n : ");
            menu=in.nextInt();
            if(menu==1){
                hijab baru=new hijab();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) st.isEmpty();
            else if(menu==5) System.out.println("keluar . . .");
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }    
}
    

