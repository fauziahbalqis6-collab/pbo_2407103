package latihan_pbo.tugas_pbo2;

public class BangunDatar {
    // enkapsulasi
    private double varA;
    private double varB;

    // constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    // getter
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    // method default
    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Luas Bangun Datar = " + hitungLuas());
    }
}
