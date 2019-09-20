import java.util.Map;

public class Configuration {

    private String characterName;
    private String difficulty;
    private Map<String, Integer> skillPointsAllocation;
    private int initialSkillPoints;
    private int initialCredits;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Map<String, Integer> getSkillPointsAllocation() {
        return skillPointsAllocation;
    }

    public void setSkillPointsAllocation(Map<String, Integer> skillPointsAllocation) {
        this.skillPointsAllocation = skillPointsAllocation;
    }

    public int getInitialSkillPoints() {
        return initialSkillPoints;
    }

    public void setInitialSkillPoints(int initialSkillPoints) {
        this.initialSkillPoints = initialSkillPoints;
    }

    public int getInitialCredits() {
        return initialCredits;
    }

    public void setInitialCredits(int initialCredits) {
        this.initialCredits = initialCredits;
    }
}
