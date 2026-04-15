package latihan_pbo.tugas_pbo2;

public class Main {
    public static void main(String[] args) {

        // polymorphism (1 tipe variabel)
        BangunDatar b1 = new Persegi(4);
        BangunDatar b2 = new PersegiPanjang(10, 5);
        BangunDatar b3 = new Segitiga(6, 8);

        b1.tampilkan();
        System.out.println();

        b2.tampilkan();
        System.out.println();

        b3.tampilkan();
    }
} 
