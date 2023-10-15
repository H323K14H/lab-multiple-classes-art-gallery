import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
     Gallery gallery;
     Artist billyBillson;
     Artist sarahStallone;
     Artwork liliesOfTheValley;
     Artwork monaLisa;
     Customer customer;


     @BeforeEach
    public void setUp(){
         gallery = new Gallery("Bright Gallery");
         billyBillson = new Artist("Billy Billson");
         liliesOfTheValley = new Artwork("Lilies of the Valley", billyBillson, 50_000);
         sarahStallone = new Artist("Sarah Stallone");
         monaLisa = new Artwork("Mona Lisa", sarahStallone, 45_000);
         gallery.addArtwork(liliesOfTheValley);
         gallery.addArtwork(monaLisa);
         customer = new Customer("Jason Bourne", 60_000);
     }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Bright Artwork");
    }

    @Test
    public void tillStartsAtZero(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

 }
