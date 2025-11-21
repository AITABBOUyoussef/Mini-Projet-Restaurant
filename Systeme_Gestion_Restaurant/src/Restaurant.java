import java.util.ArrayList;

class Restaurant {
    private String nom;
    private ArrayList<Plat> menu;
    private ArrayList<Commande> commandes;

    public Restaurant(String nom) {
        this.nom = nom;
        this.menu = new ArrayList<>();
        this.commandes = new ArrayList<>();
    }

    public void ajouterPlatMenu(Plat plat) {
        menu.add(plat);
    }

    public void enregistrerCommande(Commande commande) {
        commandes.add(commande);
    }

    public ArrayList<Commande> getCommandes() {
        return commandes;
    }
}