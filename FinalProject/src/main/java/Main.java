public class Main {
    public static void main(String[] args) {

        MusicalPentagram musicalPentagram = new MusicalPentagram(27,"C C D E C E D2 C C D E C2 B2 C C D E F E D C B g A B C2 C2");
        System.out.println(musicalPentagram.getPentagram().getNumberNote());
        System.out.println(musicalPentagram.getPentagram().getNote());


        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < musicalPentagram.getPentagram().getSizeY(); j++) {
                System.out.print(musicalPentagram.getPentagram().getPentagram()[i][j]);
            }
            System.out.println();
        }

    }
}
