public class RPGCharacter {
    private static RPGCharacter[] allCreatedCharacters = new RPGCharacter[100];
    private static int currentCreatedCharacterIndex = 0;

    private String name;
    private int max_hp;
    private int max_ap;
    private int max_dp;

    private int current_hp;
    private int current_ap;
    private int current_dp;

    public RPGCharacter(String name, int hp, int ap, int dp) {
        this.name = name;
        this.max_hp= hp;
        this.max_ap= ap;
        this.max_dp= dp;

        this.current_hp = hp;
        this.current_dp = dp;
        this.current_ap = ap;

        RPGCharacter.allCreatedCharacters[currentCreatedCharacterIndex++] = this;
    }

    public void printCharacterStats() {
        System.out.println("Name: " + this.name + " | Health: " + this.current_hp);
    }

    public void heal(int healedPoints) {
        if(healedPoints <= 0) {
            System.out.println("Healed amount of points must be greater than zero!");
        } else if(this.current_hp == this.max_hp) {
            System.out.println("HP already maxed out - no healing possible");
        } else {
            System.out.println("Healed by " + healedPoints + "HP, current HP: " + this.current_hp);
            this.current_hp = this.current_hp + healedPoints;
        }
    }

    public void attack(RPGCharacter target) {
        target.receiveAttack(this);
    }

    public void receiveAttack(RPGCharacter attacker) {
        current_hp = current_hp - attacker.getAp();
    }

    public static void resetAllCharacters() {
        for(int i = 0; i < allCreatedCharacters.length; i++) {
            if(allCreatedCharacters[i] != null) {
                allCreatedCharacters[i].reset();
            }
        }
    }

    private void reset() {
        this.current_hp = this.max_hp;
        this.current_ap = this.max_ap;
        this.current_dp = this.max_dp;
    }

    // Getter & Setter section
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        if(newName.isEmpty()) {
            System.out.println("Did not update name - no empty names allowed");
        } else {
            this.name = newName;
        }
    }

    public int getHp() {
        return this.current_hp;
    }

    public int getAp() {
        return this.current_ap;
    }

    public int getDp() {
        return this.current_dp;
    }
}
