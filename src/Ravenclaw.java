public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String fullName, int powerMagic, int distanceTransgression, int smart, int wise, int witty, int creativity) {
        super(fullName, powerMagic, distanceTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return this.smart;
    }

    public int getWise() {
        return this.wise;
    }

    public int getWitty() {
        return this.witty;
    }

    public int getCreativity() {
        return this.creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + this.smart +
                ", wise=" + this.wise +
                ", witty=" + this.witty +
                ", creativity=" + this.creativity +
                ", fullName=" + getFullName() +
                ", fullName=" + getPowerMagic() +
                ", fullName=" + getDistanceTransgression() +
                '}';
    }
}
