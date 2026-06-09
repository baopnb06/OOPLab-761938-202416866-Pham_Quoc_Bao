package hust.soict.hedspi.aims.screen.customer.store;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;

public class TestViewStoreScreen extends Application {
    private static Store store;
    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Store.FXML";

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));

        ViewStoreController viewStoreController = new ViewStoreController(store, cart);
        fxmlLoader.setController(viewStoreController);

        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();
    }

    public static void main(String[] args) {

        store = new Store();
        cart = new Cart();

        store.addMedia(new DigitalVideoDisc("Harry Potter and the Philosopher's Stone (2001)", "Fantasy", 3.0f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Chamber of Secrets (2002)", "Fantasy", 3.5f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Prisoner of Azkaban (2004)", "Fantasy", 5.0f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Goblet of Fire (2005)", "Fantasy", 4.5f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Order of the Phoenix (2007)", "Fantasy", 6.5f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Half-Blood Prince (2009)", "Fantasy", 5.8f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Deathly Hallows - Part 1 (2010)", "Fantasy", 6.3f));
        store.addMedia(new DigitalVideoDisc("Harry Potter and the Deathly Hallows - Part 2 (2011)", "Fantasy", 7.0f));
        store.addMedia(new Book("Green Eggs and Ham", "Children", 3.3f));

        launch(args);
    }
}