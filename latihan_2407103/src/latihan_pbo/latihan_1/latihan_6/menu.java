package latihan_pbo.latihan_1.latihan_6;

public class menu {
    private menu_item[] daftarMenu;

    public menu(menu_item[] daftarMenu) {
        this.daftarMenu = daftarMenu;
    }

    public void tampilkan() {
        double total = 0;

        for (menu_item item : daftarMenu) {
            double totalItem = item.getTotal();

            System.out.println(
                item.getNama() + " = " +
                item.getHarga() + " x " +
                item.getJumlah() +
                " total = " + totalItem
            );

            total += totalItem;
        }

        System.out.println("\nTotal Bayar = " + total);
    }
}