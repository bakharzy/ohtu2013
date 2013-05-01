/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import com.avaje.ebean.EbeanServer;
import olutopas.model.Rating;
import olutopas.model.User;

/**
 *
 * @author mohamad
 */
public class MyRatings implements Komento {

    private User user;

    public MyRatings() {
        
    }

    @Override
    public void command() {
        System.out.println("Ratings by " + user.getName());
        for (Rating rating : user.getRatings()) {
            System.out.println(rating);
        }
    }
}
