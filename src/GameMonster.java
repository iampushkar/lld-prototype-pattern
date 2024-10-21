public class GameMonster implements Prototype {

    private String name;
    private MonsterType type;
    private int strength;
    private int level;
    private SecretStrength secretStrength;

    public GameMonster(String name, MonsterType type, int strength, int level, SecretStrength secretStrength) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.level = level;
        this.secretStrength = secretStrength;
    }

    @Override
    public GameMonster clone() {
        var secretStrengthClone = secretStrength.clone();
        return new GameMonster(this.name, this.type, this.strength, this.level, secretStrengthClone);
    }

    public void setStrength(int strength) {
        this.level = strength;
    }

    public void setSecretStrength(SecretStrength secretStrength) {
        this.secretStrength = secretStrength;
    }

    public SecretStrength getSecretStrength() {
        return secretStrength;
    }

    @Override
    public String toString() {
        return "GameMonster{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", strength=" + strength +
                ", level=" + level +
                ", secretStrength=" + secretStrength +
                '}';
    }
}
