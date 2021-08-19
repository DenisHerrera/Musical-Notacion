public class DrawPentagram extends Draw{

    private String note;
    private int positionY;

    public DrawPentagram(char[][] staff, String note) {
        super(staff);
        this.note = note;
        positionY=2;
        addElementsPentagram();
    }

    private void addElementsPentagram(){
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

    private void reviewReplays(int repeat,char character){
        for (int i = 1; i <= repeat ; i++) {
            insertedCharacter(character);
        }
    }

    private void insertedCharacter( char character){
        switch (character){
            case 'G': super.addElement(0,positionY,'*');
                positionY++;
                break;
            case 'F': super.addElement(1,positionY,'*');
                positionY++;
                break;
            case 'E': super.addElement(2,positionY,'*');
                positionY++;
                break;
            case 'D': super.addElement(3,positionY,'*');
                positionY++;
                break;
            case 'C': super.addElement(4,positionY,'*');
                positionY++;
                break;
            case 'B': super.addElement(5,positionY,'*');
                positionY++;
                break;
            case 'A': super.addElement(6,positionY,'*');
                positionY++;
                break;
            case 'g': super.addElement(7,positionY,'*');
                positionY++;
                break;
            case 'f': super.addElement(8,positionY,'*');
                positionY++;
                break;
            case 'e': super.addElement(9,positionY,'*');
                positionY++;
                break;
            case 'd': super.addElement(10,positionY,'*');
                positionY++;
                break;
            case 'c': super.addElement(11,positionY,'*');
                positionY++;
                break;
            case 'b': super.addElement(12,positionY,'*');
                positionY++;
                break;
            case 'a': super.addElement(13,positionY,'*');
                positionY++;
                break;
        }
    }
}
