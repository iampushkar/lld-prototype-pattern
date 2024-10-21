import java.util.HashMap;
import java.util.Map;


public class MonsterRegistry {

    private static final Map<MonsterType, GameMonster> monsterMap = new HashMap<>();

    public static void addMonster(MonsterType type, GameMonster monster) {
        monsterMap.put(type, monster);
    }

    public static GameMonster getMonster(MonsterType type, int gameLevel) {
        var currentMonster = monsterMap.get(type);
        GameMonster cloneMonster = currentMonster.clone();

        cloneMonster.setStrength(gameLevel * 7); // increasing the strength as per game level
        cloneMonster.getSecretStrength().upgrade(gameLevel * 7);
        return cloneMonster;
    }
}
