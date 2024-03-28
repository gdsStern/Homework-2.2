public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullName, int powerMagic, int distanceTransgression, int nobility, int honor, int courage) {
        super(fullName, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getCourage() {
        return this.courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + this.nobility +
                ", honor=" + this.honor +
                ", courage=" + this.courage +
                ", fullName=" + getFullName() +
                ", fullName=" + getPowerMagic() +
                ", fullName=" + getDistanceTransgression() +
                '}';
    }

}
