package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store aimsStore = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        aimsStore.addDVD(dvd1);
        aimsStore.addDVD(dvd2);
        aimsStore.addDVD(dvd3);

        aimsStore.printStore();

        aimsStore.removeDVD(dvd2);
        aimsStore.printStore();

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Sci-fi", 25.0f);
        aimsStore.removeDVD(dvd4);
    }
}