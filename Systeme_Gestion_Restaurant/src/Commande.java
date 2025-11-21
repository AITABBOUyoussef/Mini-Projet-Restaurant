import java.util.ArrayList;

class Commande {
    private Client client;
    private Serveur serveur;
    private ArrayList<Plat> plats;
    private ArrayList<Integer> quantites;

    public Commande(Client client, Serveur serveur) {
        this.client = client;
        this.serveur = serveur;
        this.plats = new ArrayList<>();
        this.quantites = new ArrayList<>();
    }

    public void ajouterPlat(Plat plat, int quantite) {
        plats.add(plat);
        quantites.add(quantite);
    }

    public double calculerTotal() {
        double total = 0;
        for (int i = 0; i < plats.size(); i++) {
            total += plats.get(i).getPrix() * quantites.get(i);
        }
        return total;
    }

    public void afficherDetails() {
        System.out.println("Client : " + client.getNom());
        System.out.println("Serveur : " + serveur.getNom());
        System.out.println("----- Détails -----");

        for (int i = 0; i < plats.size(); i++) {
            Plat p = plats.get(i);
            String ligne = quantites.get(i) + " x " + p.getNom();


            if (p instanceof PlatSpecial) {
                PlatSpecial ps = (PlatSpecial) p;
                ligne += " (" + ps.getCategorieSpeciale() + ")";
            }

            ligne += " = " + (p.getPrix() * quantites.get(i)) + " MAD";
            System.out.println(ligne);
        }

        System.out.println("Total : " + calculerTotal() + " MAD");
        System.out.println("----------------------------");
    }
}