public class Pokemon {

    private String name;
    private String species;
    private int level;
    private int exp;
    private String[] moveset;

    public Pokemon(String species) {
        name = species;
        this.species = species;
        level = 1;
        exp = 0;
        moveset = new String[4];
        moveset[0] = "Tackle";
    }

    public Pokemon(String name, String species) {
        this(species);
        this.name = name;
    }

    public void shout() {
        System.out.println(this.species);
    }

    public String toString() {
        return this.name + "(" + this.species + ")";
    }

}
