public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullName, int powerMagic, int distanceTransgression, int hardworking, int loyal, int honest) {
        super(fullName, powerMagic, distanceTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return this.hardworking;
    }

    public int getLoyal() {
        return this.loyal;
    }

    public int getHonest() {
        return this.honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + this.hardworking +
                ", loyal=" + this.loyal +
                ", honest=" + this.honest +
                ", fullName=" + getFullName() +
                ", fullName=" + getPowerMagic() +
                ", fullName=" + getDistanceTransgression() +
                '}';
    }

}
