public class MusicalPentagram {

    private Pentagram pentagram;
    private DrawSpace space;
    private DrawNote drawNote;
    private DrawPentagram drawPentagram;

    public MusicalPentagram(int numberNotes, String note) {

        pentagram = new Pentagram(numberNotes,note);
        space = new DrawSpace(pentagram.getPentagram(),pentagram.getSizeY());
        drawNote = new DrawNote(pentagram.getPentagram());
        drawPentagram = new DrawPentagram(pentagram.getPentagram(),pentagram.getNote());

    }

    public Pentagram getPentagram() {
        return pentagram;
    }
}
