/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.Scanner;
import olutopas.model.Brewery;

/**
 *
 * @author mohamad
 */
public class AddBrewery implements Komento {

    private EbeanServer server;
    private Scanner scanner;

    public AddBrewery(EbeanServer server) {
        scanner = new Scanner(System.in);
        this.server = server;
    }

    @Override
    public void command() {
        System.out.print("brewery to add: ");
        String name = scanner.nextLine();
        Brewery brewery = server.find(Brewery.class).where().like("name", name).findUnique();

        if (brewery != null) {
            System.out.println(name + " already exists!");
            return;
        }

        server.save(new Brewery(name));
    }
}
