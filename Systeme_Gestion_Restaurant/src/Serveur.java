public class Serveur {
    protected int idServeur;
    protected String nom;

    public Serveur(int idServeur, String nom) {
        this.idServeur = idServeur;
        this.nom = nom;
    }

    public int getIdServeur() {
        return idServeur;
    }

    public String getNom() {
        return nom;
    }
}
