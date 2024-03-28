public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentsGryffindor = new Gryffindor[]{
                new Gryffindor("Гарри Поттер",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
                new Gryffindor("Гермиона Грейнджер",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
                new Gryffindor("Рон Уизли",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt())
        };
        Slytherin[] studentsSlytherin = new Slytherin[]{
                new Slytherin("Драко Малфой",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
                new Slytherin("Грэхэм Монтегю",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
                new Slytherin("Грегори Гойл",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt())
        };
        Hufflepuff[] studentsHufflepuff = new Hufflepuff[]{
                new Hufflepuff("Захария Смит",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
                new Hufflepuff("Седрик Диггори",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
                new Hufflepuff("Джастин Финч-Флетчли",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
        };
        Ravenclaw[] studentsRavenclaw = new Ravenclaw[]{
              new Ravenclaw("Чжоу Чанг",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
              new Ravenclaw("Падма Патил",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
              new Ravenclaw("Маркус Белби",genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt(),genRandInt()),
        };

        System.out.println(studentsGryffindor[0]);
        System.out.println(studentsSlytherin[0]);
        System.out.println(studentsHufflepuff[0]);
        System.out.println(studentsRavenclaw[0]);

        Gryffindor.compareStudents(studentsGryffindor[0],studentsGryffindor[1]);
        Slytherin.compareStudents(studentsSlytherin[0],studentsSlytherin[1]);
        Hufflepuff.compareStudents(studentsHufflepuff[0],studentsHufflepuff[1]);
        Ravenclaw.compareStudents(studentsRavenclaw[0],studentsRavenclaw[1]);
        Hogwarts.compareStudents(studentsRavenclaw[1],studentsGryffindor[1]);
    }

    public static int genRandInt() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(100)+1;
    }


}