public class Wiedzmin {

    private String name;
    private String heroClass;
    private int strengthPoints;
    private int manyPoints;
    private boolean oldOrNewHero;

    public Wiedzmin(String name, String heroClass, int strengthPoints, int manyPoints, boolean oldOrNewHero) {
        this.name = name;
        this.heroClass = heroClass;
        this.strengthPoints = strengthPoints;
        this.manyPoints = manyPoints;
        this.oldOrNewHero = oldOrNewHero;
    }

    public String getName() {
        return name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public int getManyPoints() {
        return manyPoints;
    }

    public boolean getOldOrNewHero() {
        return oldOrNewHero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public void setManyPoints(int manyPoints) {
        this.manyPoints = manyPoints;
    }

    public void setOldOrNewHero(boolean oldOrNewHero) {
        this.oldOrNewHero = oldOrNewHero;
    }

    public double strengthPointsPerSecond() {
        return (strengthPoints * manyPoints) / 2;
    }

}
