
public class ServeurVIP extends Serveur {

    public ServeurVIP(String nom) {
        super(nom);
    }


    public void offrirServiceSpecial() {
        System.out.println("Serveur VIP " + getNom() + " kay9eddem service VIP!");
    }

    @Override
    public void prendreCommande() {
        System.out.println("Serveur VIP " + getNom() + " kayakhod l-commande b tari9a spéciale.");
    }

    @Override
    public String toString() {
        return "Serveur (VIP): " + getNom();
    }
}