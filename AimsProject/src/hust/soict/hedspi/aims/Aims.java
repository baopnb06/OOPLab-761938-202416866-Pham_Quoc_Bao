package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setCategory("Education");
        book1.setCost(15.5f);
        book1.addAuthor("James Gosling");

        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", "Michael Jackson", "Quincy Jones", 42, 20.0f);
        Track track1 = new Track("Beat It", 4);
        Track track2 = new Track("Billie Jean", 5);
        cd1.addTrack(track1);
        cd1.addTrack(track2);

        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(book1);
        anOrder.addMedia(cd1);

        System.out.println("\n--- Danh sách giỏ hàng hiện tại ---");
        anOrder.printItems();


        System.out.println("\n--- Kiểm tra tìm kiếm theo ID ---");
        anOrder.searchById(1);
        anOrder.searchById(99);

        System.out.println("\n--- Kiểm tra tìm kiếm theo Title ---");
        anOrder.searchByTitle("Star");
        anOrder.searchByTitle("Java");

        System.out.println("\n--- Kiểm tra tính năng Play ---");
        dvd1.play();
        cd1.play();

        System.out.println("\n--- Sau khi xóa DVD2 (Star Wars) ---");
        anOrder.removeMedia(dvd2);
        anOrder.printItems();

        System.out.println("Tổng chi phí hiện tại: " + anOrder.totalCost() + " $");
    }
}