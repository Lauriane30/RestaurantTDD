package restauranttdd;

import java.util.ArrayList;

public class Restaurant {
    
    private ArrayList<Serveur> listeServeurs;
    
    public Restaurant(int nombreDeServeurs) {
        this.listeServeurs = new ArrayList<Serveur>();
        for(int i=0; i< nombreDeServeurs; i++) {
            this.listeServeurs.add(new Serveur());
        }
    }
    
    public double calculCA(double commande, int nombreDeServeurs) {
        return commande * (double)(nombreDeServeurs);
    }
    
    
} // end of class
