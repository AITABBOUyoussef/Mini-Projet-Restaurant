import java.lang.management.PlatformLoggingMXBean;
import java.sql.ClientInfoStatus;
import java.util.*;

public class Commande {
    private Client client;
    private Serveur serveur;
    private ArrayList<Plat> plats = new ArrayList<>();

    public Commande(Client client, Serveur serveur) {
        this.client = client;
        this.serveur = serveur;
    }

    public void ajouterPlat(Plat p) {
        plats.add(p);
    }

    public double calculerTotal() {
        double total = 0;
        for (Plat p : plats) total += p.getPrix();
        return total;
    }

    @Override
    public String toString() {
        String s = "Commande de "+ client.getNom() +" prise par "+ serveur.nom +" :\n";
        for (Plat p : plats) {
            s += " - "+ p.toString() +" \n";
        }
        s += "Total : "+ calculerTotal() +" MAD\n";
        return s;
    }
}