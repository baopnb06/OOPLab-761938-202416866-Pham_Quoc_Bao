package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;
    private float mass;

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }


    //title

    public DigitalVideoDisc(String title) {
        this.setTitle(title);
        //update attribute
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
    // category, title and cost

    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        //update attribute
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }


    // director, category, title and cost

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.setCost(cost);
        //update attribute
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }


    //all


    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);

        // update attribute
        nbDigitalVideoDiscs++;
       this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost, float mass) {
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
        this.mass = mass;
    }


    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - "
                + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
}
