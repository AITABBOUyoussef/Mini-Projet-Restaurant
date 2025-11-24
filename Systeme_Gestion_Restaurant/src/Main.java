import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean active = true;
        Scanner input = new Scanner(System.in);


        Restaurant restaurant = new Restaurant("AMAYNO");

        ArrayList<Plat> plats = new ArrayList<>();
        plats.add(new Plat("Pizza", 100.0));
        plats.add(new Plat("Pâtes", 120.0));
        plats.add(new PlatSpecial("Couscous", 150.0, "Plat du jour"));
        plats.add(new PlatSpecial("Tajine", 180.0, "Plat marocain"));

        for (Plat p : plats) {
            restaurant.ajouterPlatMenu(p);
        }

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client(1, "Yassine"));
        clients.add(new Client(2, "Sara"));
        clients.add(new Client(3, "Omar"));

        ArrayList<Serveur> serveurs = new ArrayList<>();
        serveurs.add(new Serveur(1, "Amina"));
        serveurs.add(new Serveur(2, "Karim"));
        serveurs.add(new ServeurVIP(3, "rachid" , "gold" ));

        ArrayList<Commande> commandes = new ArrayList<>();


        Commande c1 = new Commande(clients.get(0), serveurs.get(0));
        c1.ajouterPlat(plats.get(0), 2);
        c1.ajouterPlat(plats.get(2), 1);
        commandes.add(c1);

        Commande c2 = new Commande(clients.get(1), serveurs.get(1));
        c2.ajouterPlat(plats.get(1), 1);
        c2.ajouterPlat(plats.get(3), 2);
        commandes.add(c2);

        Commande c3 = new Commande(clients.get(2), serveurs.get(0));
        c3.ajouterPlat(plats.get(0), 1);
        c3.ajouterPlat(plats.get(1), 1);
        c3.ajouterPlat(plats.get(3), 1);
        commandes.add(c3);


        for (Commande cmd : commandes){
            restaurant.enregistrerCommande(cmd);
        }


        while (active){

            System.out.println("||==================================||");
            System.out.println("||   Bienvenue à AMAYNO restaurant  ||");
            System.out.println("||----------------Menu--------------||");
            System.out.println("|| 1 - Affichage du Menu des plats  ||");
            System.out.println("|| 2 - Affichage des Clients        ||");
            System.out.println("|| 3 - Affichage des Serveurs       ||");
            System.out.println("|| 4 - Affichage des Commandes      ||");
            System.out.println("|| 5 - Total des commandes          ||");
            System.out.println("|| 6 - Quitter                      ||");
            System.out.println("||==================================||");
            System.out.println("Votre choix : ");
            int n = input.nextInt();

            switch (n){

                case 1:
                    System.out.println("---- Liste des plats ----");
                    for (Plat p : plats){
                        System.out.println("Nom : " + p.getNom());
                        System.out.println("Prix : " + p.getPrix() + " MAD");

                        if (p instanceof PlatSpecial){
                            PlatSpecial ps = (PlatSpecial) p;
                            System.out.println("Categorie : " + ps.getCategorieSpeciale());
                        }
                        System.out.println("-------------------------");
                    }
                    break;

                case 2:
                    System.out.println("---- Liste des Clients ----");
                    for (Client c : clients){
                        System.out.println("ID : " + c.getIdClient());
                        System.out.println("Nom : " + c.getNom());
                        System.out.println("-------------------------");
                    }
                    break;

                case 3:
                    System.out.println("---- Liste des Serveurs ----");
                    for (Serveur s : serveurs){
                        System.out.println("ID : " + s.getIdServeur());
                        System.out.println("Nom : " + s.getNom());
                        if(s instanceof ServeurVIP){
                            ServeurVIP sv = (ServeurVIP) s;
                            System.out.println("niveau Service : " + sv.getNiveauService());
                        }
                        System.out.println("-------------------------");
                    }
                    break;

                case 4:
                    System.out.println("---- Liste des Commandes ----");
                    for (Commande cmd : commandes){
                        cmd.afficherDetails();
                    }
                    break;

                case 5:
                    System.out.println("-------------------------");
                    System.out.println("Nombre total de commandes enregistrées : "
                            + restaurant.getCommandes().size());
                    System.out.println("-------------------------");

                    break;

                case 6:
                    active = false;
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        }

        input.close();
    }
}
