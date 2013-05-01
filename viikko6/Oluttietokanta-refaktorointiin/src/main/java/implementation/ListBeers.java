/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.List;
import olutopas.model.Beer;

/**
 *
 * @author mohamad
 */
public class ListBeers implements Komento {

    private EbeanServer server;

    public ListBeers(EbeanServer server) {
        this.server = server;
    }

    @Override
    public void command() {
        List<Beer> beers = server.find(Beer.class).orderBy("brewery.name").findList();
        for (Beer beer : beers) {
            System.out.println(beer);
            if (beer.getRatings() != null && !beer.getRatings().isEmpty()) {
                System.out.println("  ratings given " + beer.getRatings().size() + " average " + beer.averageRating());
            } else {
                System.out.println("  no ratings");
            }
        }
    }
}
