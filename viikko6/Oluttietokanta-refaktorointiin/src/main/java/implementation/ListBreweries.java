/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.List;
import olutopas.model.Brewery;

/**
 *
 * @author mohamad
 */
public class ListBreweries implements Komento {

    private EbeanServer server;

    public ListBreweries(EbeanServer server) {

        this.server = server;
    }

    @Override
    public void command() {
        List<Brewery> breweries = server.find(Brewery.class).findList();
        for (Brewery brewery : breweries) {
            System.out.println(brewery);
        }
    }
}
