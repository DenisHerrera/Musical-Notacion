public class DrawSpace extends Draw{

    private int sizeY;

    public DrawSpace(char[][] pentagram, int sizeY) {
        super(pentagram);
        this.sizeY = sizeY;
        addSpace();
    }

    private void addSpace(){
        for (int j = 0; j < sizeY; j++) {
            super.addElement(1,j,'-');
            super.addElement(3,j,'-');
            super.addElement(5,j,'-');
            super.addElement(7,j,'-');
            super.addElement(9,j,'-');
            super.addElement(13,j,'-');
        }
    }

    public int getSizeY() {
        return sizeY;
    }
}
