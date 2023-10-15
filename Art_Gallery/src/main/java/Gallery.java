import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public void addArtwork(Artwork artwork) {
        this.stock.add(artwork);
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }
}
