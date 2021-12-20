public class PokemonTeam {
    private final int MAX_POKEMON_PER_TEAM = 6;
    private int currentTeamIndex;
    private Pokemon[] team;

    public PokemonTeam() {
        team = new Pokemon[MAX_POKEMON_PER_TEAM];
        currentTeamIndex = 0;
    }

    public PokemonTeam(Pokemon[] initialTeam) {
        this();

        if (initialTeam.length > MAX_POKEMON_PER_TEAM) {
            System.err.println("MAXIMUM POKEMON PER TEAM EXCEEDED");
        } else {
            for (int i = 0; i < initialTeam.length; i++) {
                this.team[i] = initialTeam[i];
            }
        }
    }

    public void printTeam() {
        System.out.println("=== TEAM ===");
        for(int i = 0; i < this.team.length; i++) {
            if(this.team[i] != null) {
                System.out.println(i+1 + ". -> " + this.team[i].toString());
            }
        }
        System.out.println("=========");
    }

    public void addToTeam(Pokemon pokemon) {
        this.team[this.currentTeamIndex] = pokemon;
        this.currentTeamIndex++;
    }
}
