import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        this.stock.add(artwork);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
    }
    public void setStock(ArrayList<Artwork> stock){
        this.stock = stock;
    }
}
