public class Pentagram {

    private char[][] pentagram;
    private int sizeY;
    private int numberNote;
    private String note;

    public Pentagram(int numberNote, String note) {
        this.note = note;
        this.numberNote = numberNote;
        checkingSize();
        pentagram = new char[14][sizeY];
    }

    private void checkingSize(){
        sizeY = note.length()+2;
        for (int i = 0; i < note.length(); i++) {
            determinateSizeY(note.charAt(i));
        }
    }

    private void determinateSizeY(char character){
        switch (character){
            case '3' : sizeY = sizeY + 1; break;
            case '4' : sizeY = sizeY + 2; break;
            case '5' : sizeY = sizeY + 3; break;
            case '6' : sizeY = sizeY + 4; break;
            case '7' : sizeY = sizeY + 5; break;
            case '8' : sizeY = sizeY + 6; break;
            case '9' : sizeY = sizeY + 7; break;
        }
    }

    public char[][] getPentagram() {
        return pentagram;
    }

    public int getSizeY() {
        return sizeY;
    }

    public String getNote() {
        return note;
    }

    public int getNumberNote() {
        return numberNote;
    }
}
