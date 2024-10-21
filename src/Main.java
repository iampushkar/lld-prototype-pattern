public class Main {
    public static void main(String[] args) {

        System.out.println("Implementing Prototype Pattern: ");

        // Creating Base Monster - Goblin and Dragon
        SecretStrength secretStrength = new SecretStrength(10, 20, 30);
        GameMonster greenGoblin = new GameMonster("Green Goblin", MonsterType.LAND, 10, 1, secretStrength);
        GameMonster dragon = new GameMonster("Draco", MonsterType.AIR, 20, 2, secretStrength);

        MonsterRegistry.addMonster(MonsterType.LAND, greenGoblin);
        MonsterRegistry.addMonster(MonsterType.AIR, dragon);

        System.out.println("Green Goblin: " + greenGoblin);
        System.out.println("Draco: " + dragon);

        // Upgrading Monsters for higher game level
        System.out.println("Level Up Monsters: ");
        GameMonster redGoblin = MonsterRegistry.getMonster(MonsterType.LAND, 4);
        GameMonster redDraco = MonsterRegistry.getMonster(MonsterType.AIR, 6);

        System.out.println("Level 4 Red Goblin: " + redGoblin);
        System.out.println("Level 4 Red Draco: " + redDraco);

    }
}
