class PlatSpecial extends Plat {
    private String categorieSpeciale;

    public PlatSpecial(String nom, double prix, String categorieSpeciale) {
        super(nom, prix);
        this.categorieSpeciale = categorieSpeciale;
    }

    public String getCategorieSpeciale() {
        return categorieSpeciale;
    }
}