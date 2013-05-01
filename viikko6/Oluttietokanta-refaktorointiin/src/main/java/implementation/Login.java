/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.Scanner;
import olutopas.model.User;

/**
 *
 * @author mohamad
 */
public class Login implements Komento {

    private EbeanServer server;
    private Scanner scanner;
    private User user;

    public Login(EbeanServer server) {
        scanner = new Scanner(System.in);
        this.server = server;
    }

    @Override
    public void command() {
        while (true) {
            System.out.println("\nLogin (give ? to register a new user)\n");
            System.out.print("username: ");
            String name = scanner.nextLine();
            if (name.equals("?")) {
                registerUser();
                continue;
            }

            this.user = server.find(User.class).where().like("name", name).findUnique();

            if (user != null) {
                break;
            }
            System.out.println("unknown user");
        }

    }

    private void registerUser() {
        System.out.println("Register a new user");
        System.out.print("give username: ");
        String name = scanner.nextLine();
        User u = server.find(User.class).where().like("name", name).findUnique();
        if (u != null) {
            System.out.println("user already exists!");
            return;
        }
        server.save(new User(name));
        this.user = server.find(User.class).where().like("name", name).findUnique();
        System.out.println("user created!\n");
    }
    public User whoIs(){
    return this.user;
    }
}
