/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.Scanner;
import olutopas.model.Beer;
import javax.persistence.OptimisticLockException;
import olutopas.model.Beer;
import olutopas.model.Brewery;

/**
 *
 * @author mohamad
 */
import olutopas.model.Rating;
import olutopas.model.User;
public class FindBeer implements Komento{
   
    private EbeanServer server;
    private Scanner scanner;
    private User user;

    public FindBeer(EbeanServer server) {
    scanner = new Scanner(System.in);
    this.server=server;
    }
    
    @Override
    public void command() {
        System.out.print("beer to find : ");
        String beerToBeFound = scanner.nextLine();
        Beer foundBeer = server.find(Beer.class).where().like("name", beerToBeFound).findUnique();
        if (foundBeer == null) {
            System.out.println(beerToBeFound + " not found");
            return;
        }

        System.out.println(foundBeer);

        if (foundBeer.getRatings() != null && !foundBeer.getRatings().isEmpty()) {
            System.out.println("  number of ratings: "+ foundBeer.getRatings().size() + " average " + foundBeer.averageRating());
        } else {
            System.out.println("no ratings");
        }

        System.out.print("give rating (leave emtpy if not): ");
        try {
            int rating = Integer.parseInt(scanner.nextLine());
            addRating(foundBeer, rating);
        } catch (Exception e) {
        }
    }
        private void addRating(Beer foundBeer, int value) {
        Rating rating = new Rating(foundBeer, user, value);
        server.save(rating);
    }
    
}
