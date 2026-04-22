package hust.soict.hedspi.aims.media;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.Object;
public class Book {
    private int id;
    private String title;
    private  String category;
    private  float cost;
    private ArrayList<String> authors = new ArrayList<>();

    public Book() {

    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author " + authorName + " has been added.");
        } else {
            System.out.println("Author " + authorName + " has been extinct in the list.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author " + authorName + " has been deleted.");
        } else {
            System.out.println("Not found " + authorName + " to delete.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
