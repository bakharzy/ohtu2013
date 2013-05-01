/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.Scanner;
import olutopas.model.Beer;
import olutopas.model.Brewery;
import olutopas.model.User;

/**
 *
 * @author mohamad
 */
public class FindBrewery implements Komento {

    private EbeanServer server;
    private Scanner scanner;

    public FindBrewery(EbeanServer server) {
        scanner = new Scanner(System.in);
        this.server = server;
    }

    @Override
    public void command() {
        System.out.print("brewery to find: ");
        String n = scanner.nextLine();
        Brewery foundBrewery = server.find(Brewery.class).where().like("name", n).findUnique();

        if (foundBrewery == null) {
            System.out.println(n + " not found");
            return;
        }

        System.out.println(foundBrewery);
        for (Beer bier : foundBrewery.getBeers()) {
            System.out.println("   " + bier.getName());
        }
    }
}
