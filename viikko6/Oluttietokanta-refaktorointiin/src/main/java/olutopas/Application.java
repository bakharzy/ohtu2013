package olutopas;

import com.avaje.ebean.EbeanServer;
import implementation.FindBeer;
import java.util.List;
import java.util.Scanner;
import javax.persistence.OptimisticLockException;
import olutopas.model.Beer;
import olutopas.model.Brewery;
import olutopas.model.Rating;
import olutopas.model.User;
import implementation.*;

public class Application {

    private EbeanServer server;
    private Scanner scanner;
    private User user;
    private Komento findBeer;
    private Komento login;
    private Komento findBrewery;
    private Komento listBreweries;
    private Komento addBeer;
    private Komento deleteBeer;
    private Komento listBeers;
    private Komento listUsers;
    private Komento myRatings;
    private Komento addBrewery;
    private Komento deleteBrewery;
    private Login login2;

    public Application(EbeanServer server) {
        this.findBeer = new FindBeer(server);
        this.server = server;
        this.scanner = new Scanner(System.in);
        this.login = new Login(server);
        this.findBrewery = new FindBrewery(server);
        this.listBreweries = new ListBreweries(server);
        this.addBeer = new AddBeer(server);
        this.deleteBeer = new DeleteBeer(server);
        this.listBeers = new ListBeers(server);
        this.listUsers = new ListUsers(server);
        this.myRatings = new MyRatings();
        this.addBrewery = new AddBrewery(server);
        this.deleteBrewery = new DeleteBrewery(server);
        this.login2 =new Login(server);
    }

    public void run(boolean newDatabase) {
        if (newDatabase) {
            seedDatabase();
        }

        login.command();
        //this.user=login2.whoIs();
       

        System.out.println("\nWelcome to Ratebeer "+ this.user);

        while (true) {
            menu();
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("q")) {
                break;
            } else if (command.equals("1")) {
                findBrewery.command();
            } else if (command.equals("2")) {
                findBeer.command();
            } else if (command.equals("3")) {
                addBeer.command();
            } else if (command.equals("4")) {
                listBreweries.command();
            } else if (command.equals("5")) {
                deleteBeer.command();
            } else if (command.equals("6")) {
                listBeers.command();
            } else if (command.equals("7")) {
                deleteBrewery.command();
            } else if (command.equals("8")) {
                addBrewery.command();
            } else if (command.equals("9")) {
                myRatings.command();
            } else if (command.equals("0")) {
                listUsers.command();
            } else {
                System.out.println("unknown command");
            }

            System.out.print("\npress enter to continue");
            scanner.nextLine();
        }

        System.out.println("bye");
    }

    private void menu() {
        System.out.println("");
        System.out.println("1   find brewery");
        System.out.println("2   find/rate beer");
        System.out.println("3   add beer");
        System.out.println("4   list breweries");
        System.out.println("5   delete beer");
        //
        System.out.println("6   list beers");
        System.out.println("7   delete brewery");
        System.out.println("8   add brewery");
        //

        //
        System.out.println("9   show my ratings");
        System.out.println("0   list users");
        //
        System.out.println("q   quit");
        System.out.println("");
    }

    private void seedDatabase() throws OptimisticLockException {
        Brewery brewery = new Brewery("Schlenkerla");
        brewery.addBeer(new Beer("Urbock"));
        brewery.addBeer(new Beer("Lager"));
        // tallettaa myös luodut oluet, sillä Brewery:n OneToMany-mappingiin on määritelty
        // CascadeType.all
        server.save(brewery);

        // luodaan olut ilman panimon asettamista
        Beer b = new Beer("Märzen");
        server.save(b);

        // jotta saamme panimon asetettua, tulee olot lukea uudelleen kannasta
        b = server.find(Beer.class, b.getId());
        brewery = server.find(Brewery.class, brewery.getId());
        brewery.addBeer(b);
        server.save(brewery);

        server.save(new Brewery("Paulaner"));

        server.save(new User("mluukkai"));
    }
}
