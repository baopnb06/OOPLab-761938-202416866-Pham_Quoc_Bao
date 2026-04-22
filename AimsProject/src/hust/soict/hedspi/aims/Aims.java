package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("\n--- Print ---");
        anOrder.printItems();

        System.out.println("\n--- Kiểm tra tìm kiếm theo ID ---");
        System.out.println("Tìm ID 1:");
        anOrder.searchById(1);

        System.out.println("Tìm ID 99:");
        anOrder.searchById(99);

        System.out.println("\n--- Kiểm tra tìm kiếm theo Title ---");
        System.out.println("Tìm tiêu đề 'Star':");
        anOrder.searchByTitle("Star");

        System.out.println("Tìm tiêu đề 'Avenger':");
        anOrder.searchByTitle("Avenger");

        System.out.println("\n--- Sau khi xóa DVD2 (Star Wars) ---");
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.printItems();
    }
}