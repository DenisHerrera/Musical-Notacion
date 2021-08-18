public class DrawNote extends Draw{

    public DrawNote(char[][] pentagram) {
        super(pentagram);
        drawPoints();

        drawNotes();
    }

    private void drawPoints(){
        for(int i = 0 ; i < 14; i++){
            super.addElement(i,1,':');
        }
    }

    private void drawNotes(){
        super.addElement(0,0,'G');
        super.addElement(1,0,'F');
        super.addElement(2,0,'E');
        super.addElement(3,0,'D');
        super.addElement(4,0,'C');
        super.addElement(5,0,'B');
        super.addElement(6,0,'A');
        super.addElement(7,0,'g');
        super.addElement(8,0,'f');
        super.addElement(9,0,'e');
        super.addElement(10,0,'d');
        super.addElement(11,0,'c');
        super.addElement(12,0,'b');
        super.addElement(13,0,'a');
    }
}
