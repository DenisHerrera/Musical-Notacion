public class MusicalNotacion {
    private int numberNotes;
    private  String note;
    private int positionY;
    private int ejeY;
    private char[][] pentagram;

    public MusicalNotacion(int numberNotes, String note) {
        this.numberNotes = numberNotes;
        this.note = note;
        positionY=2;
        checkingSize();
        pentagram = new char[14][ejeY];
        drawSpace();
        drawNotes();
        drawPoints();
        drawPentagram();
    }

    private void drawPoints(){
        for(int i = 0 ; i < 14; i++){
            pentagram[i][1] = ':';
        }

    }
    private void drawNotes(){
        pentagram[0][0] = 'G';
        pentagram[1][0] = 'F';
        pentagram[2][0] = 'E';
        pentagram[3][0] = 'D';
        pentagram[4][0] = 'C';
        pentagram[5][0] = 'B';
        pentagram[6][0] = 'A';
        pentagram[7][0] = 'g';
        pentagram[8][0] = 'f';
        pentagram[9][0] = 'e';
        pentagram[10][0] = 'd';
        pentagram[11][0] = 'c';
        pentagram[12][0] = 'b';
        pentagram[13][0] = 'a';
    }

    private void checkingSize(){
        ejeY = note.length()+2;
        for (int i = 0; i < note.length(); i++) {
            determinateSizeY(note.charAt(i));
        }
    }

    private void determinateSizeY(char character){
        switch (character){
            case '3' : ejeY = ejeY + 1; break;
            case '4' : ejeY = ejeY + 2; break;
            case '5' : ejeY = ejeY + 3; break;
            case '6' : ejeY = ejeY + 4; break;
            case '7' : ejeY = ejeY + 5; break;
            case '8' : ejeY = ejeY + 6; break;
            case '9' : ejeY = ejeY + 7; break;
        }
    }

    private void drawPentagram(){
        for(int i = 0; i < note.length(); i++){
                if(note.charAt(i) != ' '){
                    draw(i, note.charAt(i));
                }else{
                    positionY++;
                }
        }
    }

    private void draw(int index, char character){
        switch (character){
            case '2': reviewReplays(1,note.charAt(index-1));break;
            case '3': reviewReplays(2,note.charAt(index-1));break;
            case '4': reviewReplays(3,note.charAt(index-1));break;
            case '5': reviewReplays(4,note.charAt(index-1));break;
            case '6': reviewReplays(5,note.charAt(index-1));break;
            case '7': reviewReplays(6,note.charAt(index-1));break;
            case '8': reviewReplays(7,note.charAt(index-1));break;
            case '9': reviewReplays(8,note.charAt(index-1));break;
            default: reviewReplays(1,note.charAt(index));break;
        }
    }

    private void reviewReplays(int repeticiones,char character){
        for (int i = 1; i <= repeticiones ; i++) {
                incertedCharacter(character);
        }
    }

    private void incertedCharacter( char character){
        switch (character){
            case 'G': pentagram [0][positionY]= '*';
                      positionY++;
                      break;
            case 'F': pentagram [1][positionY]= '*';
                      positionY++;
                      break;
            case 'E': pentagram [2][positionY]= '*';
                      positionY++;
                      break;
            case 'D': pentagram [3][positionY]= '*';
                      positionY++;
                      break;
            case 'C': pentagram [4][positionY]= '*';
                      positionY++;
                      break;
            case 'B': pentagram [5][positionY]= '*';
                      positionY++;
                      break;
            case 'A': pentagram [6][positionY]= '*';
                      positionY++;
                      break;
            case 'g': pentagram [7][positionY]= '*';
                      positionY++;
                      break;
            case 'f': pentagram [8][positionY]= '*';
                      positionY++;
                      break;
            case 'e': pentagram [9][positionY]= '*';
                      positionY++;
                      break;
            case 'd': pentagram [10][positionY]= '*';
                      positionY++;
                      break;
            case 'c': pentagram [11][positionY]= '*';
                      positionY++;
                      break;
            case 'b': pentagram [12][positionY]= '*';
                      positionY++;
                      break;
            case 'a': pentagram [13][positionY]= '*';
                      positionY++;
                      break;
        }
    }

    private void drawSpace(){
        for (int j = 0; j < ejeY; j++) {
            pentagram[1][j] = '-' ;
            pentagram[3][j] = '-' ;
            pentagram[5][j] = '-' ;
            pentagram[7][j] = '-' ;
            pentagram[9][j] = '-' ;
            pentagram[13][j] = '-' ;
        }

    }

    public int getSizeY() {
        return ejeY;
    }

    public int getNumberNotes() {
        return numberNotes;
    }

    public char[][] getStaff() {
        return pentagram;
    }
}
