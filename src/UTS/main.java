package UTS;

import java.util.Scanner;
import java.util.Stack;

public class main {
    
    public static void main (String [] args){
        persamaan tes = new persamaan();
        String inputan = tes.Input_Stack();

        String cek = tes. conversiStringToStack(inputan);
        if (cek != "x"){
            tes.cekInput(tes.stackPoint,inputan);
    }
    }
}

