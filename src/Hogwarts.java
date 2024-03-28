public class Hogwarts {
    private String fullName;
    private int powerMagic;
    private int distanceTransgression;
    public Hogwarts(String fullName, int powerMagic, int distanceTransgression) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getPowerMagic() {
        return this.powerMagic;
    }

    public int getDistanceTransgression() {
        return this.distanceTransgression;
    }

    public static void compareStudents(Gryffindor student1,Gryffindor student2) {
        int totalStudent1 = student1.getNobility()+ student1.getHonor()+ student2.getCourage();
        int totalStudent2 = student2.getNobility()+ student2.getHonor()+ student2.getCourage();
        if (totalStudent2 > totalStudent1) {
            System.out.println("Сильнее "+student2.getFullName()+" чем "+student1.getFullName());
        } else {
            System.out.println("Сильнее "+student1.getFullName()+" чем "+student2.getFullName());
        }
    }
    public static void compareStudents(Hufflepuff student1, Hufflepuff student2){
        int totalStudent1 = student1.getHardworking()+ student1.getHonest()+ student2.getLoyal();
        int totalStudent2 = student2.getHardworking()+ student2.getHonest()+ student2.getLoyal();
        if (totalStudent2 > totalStudent1) {
            System.out.println("Сильнее "+student2.getFullName()+" чем "+student1.getFullName());
        } else {
            System.out.println("Сильнее "+student1.getFullName()+" чем "+student2.getFullName());
        }
    }
    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int totalStudent1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getCreativity();
        int totalStudent2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getCreativity();
        if (totalStudent2 > totalStudent1) {
            System.out.println("Сильнее "+student2.getFullName()+" чем "+student1.getFullName());
        } else {
            System.out.println("Сильнее "+student1.getFullName()+" чем "+student2.getFullName());
        }
    }
    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int totalStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness()+student1.getThirstForPower();
        int totalStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness()+student2.getThirstForPower();
        if (totalStudent2 > totalStudent1) {
            System.out.println("Сильнее "+student2.getFullName()+" чем "+student1.getFullName());
        } else {
            System.out.println("Сильнее "+student1.getFullName()+" чем "+student2.getFullName());
        }
    }

    public static void compareStudents(Hogwarts student1,Hogwarts student2) {
        int totalStudent1 = student1.getPowerMagic()+ student1.getDistanceTransgression();
        int totalStudent2 = student2.getPowerMagic()+ student2.getDistanceTransgression();
        if (totalStudent2 > totalStudent1) {
            System.out.println("Сильнее "+student2.getFullName()+" чем "+student1.getFullName());
        } else {
            System.out.println("Сильнее "+student1.getFullName()+" чем "+student2.getFullName());
        }
    }
}
