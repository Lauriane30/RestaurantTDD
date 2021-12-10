package restauranttdd;

import java.util.ArrayList;

public class Franchise {
    
    private ArrayList<Restaurant> listeRestaurants;
    
    public Franchise(int nombreDeRestaurants, int nombreDeServeurs) {
        this.listeRestaurants = new ArrayList<Restaurant>();
        for(int i=0; i< nombreDeRestaurants; i++) {
            this.listeRestaurants.add(new Restaurant(nombreDeServeurs));
        }
    }
    
    public double calculCA(int nombreDeRestaurants, int nombreDeServeurs, double commande) {
        return (double)(nombreDeServeurs) * (double)(nombreDeServeurs) * commande;
    }
    
} // end of class
