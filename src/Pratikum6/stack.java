/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum6;

/**
 *
 * @author Administrator
 */
public class stack {
  hijab top;
    public stack(){
        top=null;
    }
    public void push(hijab a){
        if(top==null) top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    public void pop(){
        if(top==null) System.out.println("kosong");
        else{
            System.out.println("Hapus Stock Baru. . .");
            top.view();
            top=top.next;
        }
    }
    public void isEmpty() {
        if (top == null) System.out.println("Stock kosong");
        else {
            System.out.println("Stock Ready");
        }
    }

    public void view(){
        if(top==null) System.out.println("kosong");
        else{
            hijab ptr=top;
            while(ptr!=null){
                System.out.println("- - - - -");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }

 
}