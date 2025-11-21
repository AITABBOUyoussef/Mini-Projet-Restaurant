public class Client {

    private String nom;

    // (Note: Hna ghadi nzido "List<Commande> commandes;" mn ba3d)

    // Constructeur
    public Client(String nom) {
        this.nom = nom;
    }

    // Getters / Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // toString()
    @Override
    public String toString() {
        return "Client: " + nom;
    }
}