package UTS;

import java.util.Scanner;
import java.util.Stack;

public class persamaan {
    Stack<Character> stackPoint = new Stack<>();
    Stack<Character> left = new Stack<>();
    Stack<Character> right = new Stack<>();
    public String Input_Stack() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input data persamaan  :");
        
        String inputan = input.next();
        return inputan;
    }
    public String conversiStringToStack(String inputan){
        String cekInputan = "y";
        int indexs = inputan.indexOf("=");
        int indexs2 = inputan.indexOf("1");
        if (indexs == -1 || indexs2 == -1){
            System.out.println(inputan + " adalah persamaan yang tidak valid");
            cekInputan = "x";
        }
        String z = "+";
        char plus = z.charAt(0);
        String k = "=1";
        char equal = k.charAt(0);
        char one = k.charAt(1);
        for (int i = 0; i < inputan.length(); i ++){
            if (inputan.charAt(i) != plus){
                this.stackPoint.push(inputan.charAt(i));
                if (inputan.charAt(i) != one && inputan.charAt(i) != equal){
                    System.out.println(inputan + " tidak valid karena karakter yang diijinkan hanya 1,+,dan=");
                    cekInputan = "x";
                }

            }
        }
        return cekInputan;
    }
    public void cekInput(Stack stack,String inputan){
        String k = "=1";
        char equal = k.charAt(0);
        char one = k.charAt(1);
        int counter = 0;
        String cek = "t";
        left = stackPoint;
        for (int j = 0; j < stackPoint.size();j++){
            if (left.peek() == one){
                right.push(left.pop());
            }
            if (left.peek() == equal){
                left.pop();
                counter ++;
                if (counter == 2) {
                    System.out.println(inputan + " tidak valid karena hanya satu tanda sama dengan yang diijinkan.");
                    cek = "s";
                    break;
                }
            }
        }
        if (cek == "t"){
            if (left.size() == right.size()){
                System.out.println(inputan + " adalah persamaan yang valid");
            }
            if (left.size() != right.size()){
                System.out.println(inputan + " adalah persamaan yang tidak valid");
            }
        }
    }
}
