class ServeurVIP extends Serveur {
    private String niveauService;

    public ServeurVIP(int idServeur, String nom, String niveauService) {
        super(idServeur, nom);
        this.niveauService = niveauService;
    }

    public String getNiveauService() {
        return niveauService;
    }
}