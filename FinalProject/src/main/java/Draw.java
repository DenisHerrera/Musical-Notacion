public class Draw {
    private char[][] pentagram;


    public Draw(char[][] pentagram){
        this.pentagram = pentagram;
    }

    public void addElement(int positionX, int positionY, char element){
        pentagram[positionX][positionY] = element;
    }
}
