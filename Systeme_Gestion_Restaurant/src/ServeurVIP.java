// Kandiro "extends Serveur" bach n'héritiw
public class ServeurVIP extends Serveur {

    // Constructeur: Kay3eyet l-constructeur dyal l-Parent (Serveur)
    public ServeurVIP(String nom) {
        super(nom); // "super" kat3eyet l Serveur(nom)
    }

    // Hada howa l-service spécial dyalo 
    public void offrirServiceSpecial() {
        System.out.println("Serveur VIP " + getNom() + " kay9eddem service VIP!");
    }

    // N9dro nbeddlo (override) 7ta l-methode l-9dima
    @Override
    public void prendreCommande() {
        System.out.println("Serveur VIP " + getNom() + " kayakhod l-commande b tari9a spéciale.");
    }

    // Nbeddlo toString() bach nbeyno belli VIP
    @Override
    public String toString() {
        return "Serveur (VIP): " + getNom();
    }
}