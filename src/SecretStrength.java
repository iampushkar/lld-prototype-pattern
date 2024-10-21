public class SecretStrength implements Prototype {
    private int secretPower;
    private int agility;
    private int speed;

    public SecretStrength(int secretPower, int agility, int speed) {
        this.secretPower = secretPower;
        this.agility = agility;
        this.speed = speed;
    }

    @Override
    public SecretStrength clone() {
        return new SecretStrength(this.secretPower, this.agility, this.speed);
    }

    public void upgrade(int gameLevel) {
        secretPower = this.secretPower * gameLevel;
        agility = this.agility * gameLevel;
        speed = this.speed * gameLevel;
    }

    @Override
    public String toString() {
        return "SecretStrength{" +
                "secretPower=" + secretPower +
                ", agility=" + agility +
                ", speed=" + speed +
                '}';
    }
}
