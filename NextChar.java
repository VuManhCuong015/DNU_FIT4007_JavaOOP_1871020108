public class NextChar {
    private char ch;

    public NextChar(char ch) {
        this.ch = ch;
    }

    public char getNextChar() {
        return (char) (ch + 1);
    }
    public void displayNextChar() {
        System.out.println("ky tu lien sau"+ ch+"la:"+ getNextChar());
    }
}
