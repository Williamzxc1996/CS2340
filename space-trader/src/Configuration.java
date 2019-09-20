import java.util.Map;

public class Configuration {

    private static String characterName;
    private static String difficulty;
    private static Map<String, Integer> skillPointsAllocation;
    private static int initialSkillPoints;
    private static int initialCredits;

    public static String getCharacterName() {
        return characterName;
    }

    public static void setCharacterName(String characterName) {
        characterName = characterName;
    }

    public static String getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(String difficulty) {
        difficulty = difficulty;
    }

    public static Map<String, Integer> getSkillPointsAllocation() {
        return skillPointsAllocation;
    }

    public static void setSkillPointsAllocation(Map<String, Integer> skillPointsAllocation) {
        skillPointsAllocation = skillPointsAllocation;
    }

    public static int getInitialSkillPoints() {
        return initialSkillPoints;
    }

    public static void setInitialSkillPoints(int initialSkillPoints) {
        initialSkillPoints = initialSkillPoints;
    }

    public static int getInitialCredits() {
        return initialCredits;
    }

    public static void setInitialCredits(int initialCredits) {
        initialCredits = initialCredits;
    }
}
