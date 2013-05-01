/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.Scanner;
import olutopas.model.Beer;

/**
 *
 * @author mohamad
 */
public class DeleteBeer implements Komento {

    private EbeanServer server;
    private Scanner scanner;

    public DeleteBeer(EbeanServer server) {
        scanner = new Scanner(System.in);
        this.server = server;
    }

    @Override
    public void command() {
        System.out.print("beer to delete: ");
        String n = scanner.nextLine();
        Beer beerToDelete = server.find(Beer.class).where().like("name", n).findUnique();

        if (beerToDelete == null) {
            System.out.println(n + " not found");
            return;
        }

        server.delete(beerToDelete);
        System.out.println("deleted: " + beerToDelete);
    }
}
