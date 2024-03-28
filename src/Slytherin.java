public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String fullName, int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, powerMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getThirstForPower() {
        return this.thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + this.cunning +
                ", determination=" + this.determination +
                ", ambition=" + this.ambition +
                ", resourcefulness=" + this.resourcefulness +
                ", thirstForPower=" + this.thirstForPower +
                ", fullName=" + getFullName() +
                ", fullName=" + getPowerMagic() +
                ", fullName=" + getDistanceTransgression() +
                '}';
    }
}
