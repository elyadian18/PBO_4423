package pratikum6;

public class stack {
    hijab top = null;

    public stack() {
    }

    public void push(hijab a) {
        if (this.top == null) {
            this.top = a;
        } else {
            a.next = this.top;
            this.top = a;
        }

    }

    public void pop() {
        if (this.top == null) {
            System.out.println("kosong");
        } else {
            System.out.println("Hapus Stock Baru. . .");
            this.top.view();
            this.top = this.top.next;
        }

    }

    public void isEmpty() {
        if (this.top == null) {
            System.out.println("Stock kosong");
        } else {
            System.out.println("Stock Ready");
        }

    }

    public void view() {
        if (this.top == null) {
            System.out.println("kosong");
        } else {
            for(hijab ptr = this.top; ptr != null; ptr = ptr.next) {
                System.out.println("- - - - -");
                ptr.view();
            }
        }

    }
}
