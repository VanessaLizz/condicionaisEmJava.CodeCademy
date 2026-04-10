package aulas;

class Noodle {
    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public final boolean isTasty() {
        return true;
    }

    public void cook() {
        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }
}
