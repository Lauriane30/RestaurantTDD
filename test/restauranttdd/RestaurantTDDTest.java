package restauranttdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTDDTest {
    
    public RestaurantTDDTest() {
    }
    
    private static final double DELTA = 1e-15;
    
    @Test
    public void testChiffresAffaires() {
        int resultatAttendu = 0;
        // ÉTANT DONNÉ un nouveau serveur
        Serveur s = new Serveur();
        // QUAND on récupére son chiffre d'affaires
        int chiffreAffaires = s.chifffreAffaires();
        // ALORS celui-ci est à 0
        assertEquals(resultatAttendu, chiffreAffaires, DELTA);
    }
    
    @Test
    public void testChiffresAffairesPremiereCommande() {
        int resultatAttendu = 55;
        // ÉTANT DONNÉ un nouveau serveur
        Serveur s = new Serveur();
        // QUAND il prend une commande
        int resultatEffectif = s.chiffresAffairesPremiereCommande();
        // ALORS son chiffre d'affaires est le montant de celle-ci
        assertEquals(resultatAttendu, resultatEffectif, DELTA);
    }
    
    @Test
    public void testAdditionCommandes() {
        int resultatAttendu = 90;
        // ÉTANT DONNÉ un serveur ayant déjà pris une commande
        Serveur s = new Serveur();
        // QUAND il prend une nouvelle commande
        int commandeSuivante = 35;
        int resultatEffectif = s.additionCommandes(55) + commandeSuivante;
        // ALORS son chiffre d'affaires est la somme des deux commandes
        assertEquals(resultatAttendu, resultatEffectif, DELTA);
    }
    
    @Test
    public void testchiffreAffairesFranchise() {
        double resultatAttendu = 100;
        // CAS(X = 0; X = 1; X = 2; X = 100)
        int nombreDeServeurs = 100;
        // ÉTANT DONNÉ un restaurant ayant X serveurs
        Restaurant r = new Restaurant(nombreDeServeurs);
        // QUAND tous les serveurs prennent une commande d'un montant Y
        // CAS(Y = 1.0)
        double commande = 1.0;
        double resultatEffectif = r.calculCA(commande, nombreDeServeurs);
        // ALORS le chiffre d'affaires de la franchise est X * Y
        assertEquals(resultatAttendu, resultatEffectif, DELTA);
    }
    
    @Test
    public void testchiffreAffairesFranchise2() {
        double resultatAttendu = 1000000;
        // CAS(X = 0; X = 1; X = 2; X = 1000)
        int nombreDeRestaurants = 1000;
        // CAS(Y = 0; Y = 1; Y = 2; Y = 1000)
        int nombreDeServeurs = 1000;
        // ÉTANT DONNÉ une franchise ayant X restaurants de Y serveurs chacuns
        Franchise f = new Franchise(nombreDeRestaurants, nombreDeServeurs);
        // QUAND tous les serveurs prennent une commande d'un montant Z
        // CAS(Z = 1.0)
        double commande = 1.0;
        double resultatEffectif = f.calculCA(nombreDeRestaurants, nombreDeServeurs, commande);
        // ALORS le chiffre d'affaires de la franchise est X * Y * Z
        assertEquals(resultatAttendu, resultatEffectif, DELTA);
    }
    
} // end of class
