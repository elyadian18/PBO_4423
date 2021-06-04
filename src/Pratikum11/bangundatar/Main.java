package pratikum11.bangundatar;

public class Main {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(4, 4, 5);
        System.out.println("Luas Kotak = " + kotak.getLuas());
        System.out.println("Keliling Kotak = " + kotak.getKeliling());
        Segitiga segitiga = new Segitiga(1, 5,6);
        System.out.println("Luas Segitiga = " + segitiga.getLuas());
        System.out.println("==========================================");
        kotak.resize(2);
        System.out.println("Luas Kotak (setelah resize) = " + kotak.getLuas());
        System.out.println("Keliling Kotak (setelah resize) = " + kotak.getKeliling());
    }
}
