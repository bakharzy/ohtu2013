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
public class DeleteBrewery implements Komento {

    private EbeanServer server;
    private Scanner scanner;

    public DeleteBrewery(EbeanServer server) {
        scanner = new Scanner(System.in);
        this.server = server;
    }

    @Override
    public void command() {
        System.out.print("to which brewery: ");
        String name = scanner.nextLine();
        Brewery brewery = server.find(Brewery.class).where().like("name", name).findUnique();

        if (brewery == null) {
            System.out.println(name + " does not exist");
            return;
        }

        server.delete(brewery);

        System.out.println("deleted: " + name);
    }
}
