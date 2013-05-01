/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import java.util.List;
import olutopas.model.User;

/**
 *
 * @author mohamad
 */
public class ListUsers implements Komento {

    private EbeanServer server;

    public ListUsers(EbeanServer server) {
        this.server = server;
    }

    @Override
    public void command() {
        List<User> users = server.find(User.class).findList();
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getRatings().size() + " ratings");
        }
    }
}
