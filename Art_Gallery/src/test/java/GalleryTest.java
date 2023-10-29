import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;
    Artist billyBillson;
    Artist sarahStallone;
    Artwork liliesOfTheValley;
    Artwork monaLisa;
    Customer customer;
    ArrayList<Artwork> stock;


    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Bright Artwork");

        billyBillson = new Artist("Billy Billson");
        liliesOfTheValley = new Artwork("Lilies of the Valley", billyBillson, 50_000);

        sarahStallone = new Artist("Sarah Stallone");
        monaLisa = new Artwork("Mona Lisa", sarahStallone, 45_000);

        gallery.addArtwork(liliesOfTheValley);
        gallery.addArtwork(monaLisa);

        customer = new Customer("Jason Bourne", 60_000);

        stock = new ArrayList<>(Arrays.asList(liliesOfTheValley, monaLisa));
    }

    @Test
    public void canGetName() {
        assertThat(gallery.getName()).isEqualTo("Bright Artwork");
    }

    @Test
    public void canSetName() {
        gallery.setName("Bright Gallery");
        assertThat(gallery.getName()).isEqualTo("Bright Gallery");
    }

    @Test
    public void tillStartsAtZero() {
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canGetStock() {
        assertThat(gallery.getStock()).isEqualTo(stock);
    }

    @Test
    public void canSetStock() {
        Artist daveEverson = new Artist("Dave Everson");

        Artwork pikachu = new Artwork("Pikachu", daveEverson, 200);
        Artwork charizard = new Artwork("Charizad", daveEverson, 2_000);
        Artwork dialga = new Artwork("Dialga", daveEverson, 2_000_000);

        ArrayList<Artwork> pokemonStock = new ArrayList<>(Arrays.asList(pikachu, charizard, dialga));

        gallery.setStock(pokemonStock);

        assertThat(gallery.getStock()).isEqualTo(pokemonStock);

    }
}
