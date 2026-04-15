package latihan_pbo.latihan_1.latihan_6;

public class Main {
    public static void main(String[] args) {

        menu_item[] items = {
            new menu_item("Nasi Goreng", 12000, 4),
            new menu_item("Ketoprak", 12000, 1),
            new menu_item("Soda Gembira", 8000, 5)
        };

        menu m = new menu(items);
        m.tampilkan();
    }
}