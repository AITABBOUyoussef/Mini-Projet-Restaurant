public class Serveur {

    // Attribut
    private String nom;

    // Constructeur
    public Serveur(String nom) {
        this.nom = nom;
    }

    // Getters / Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Method (fonction) dyal l-serveur
    public void prendreCommande() {
        // Hna mn ba3d ghadi yji l-code dyal commande
        System.out.println("Serveur " + this.nom + " kayakhod l-commande.");
    }

    // toString()
    @Override
    public String toString() {
        return "Serveur: " + nom;
    }
}