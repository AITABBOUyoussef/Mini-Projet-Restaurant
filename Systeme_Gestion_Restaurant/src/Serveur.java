public class Serveur {


    private String nom;


    public Serveur(String nom) {
        this.nom = nom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void prendreCommande() {
        System.out.println("Serveur " + this.nom + " kayakhod l-commande.");
    }


    @Override
    public String toString() {
        return "Serveur: " + nom;
    }
}