public class PokemonTester {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu");
        Pokemon evoli = new Pokemon("Frank", "Evoli");

        PokemonTeam team1 = new PokemonTeam();
        team1.addToTeam(pikachu);
        team1.addToTeam(evoli);
        team1.printTeam();
    }
}
