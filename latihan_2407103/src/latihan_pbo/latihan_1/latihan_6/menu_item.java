package latihan_pbo.latihan_1.latihan_6;

public class menu_item {
    private String nama;
    private double harga;
    private int jumlah;

    public menu_item(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return harga * jumlah;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}