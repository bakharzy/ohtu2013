package olutopas.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rating {

    private Integer point;

    public Rating() {
    }

    public Rating(Integer point) {
        this.point= point;
    }
    
    @Id
    private Integer id;
    
    @ManyToOne
    private User user;
    @ManyToOne
    private Beer beer;
    
    
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}