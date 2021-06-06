package parser;

public class Digit {

    public static final char[][] NULL = {
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'}};
    public static final char[][] ZERO = {
            {' ', '_', ' '},
            {'|', ' ', '|'},
            {'|', '_', '|'}};
    public static final char[][] ONE = {
            {' ', ' ', ' '},
            {' ', ' ', '|'},
            {' ', ' ', '|'}};
    public static final char[][] TWO = {
            {' ', '_', ' '},
            {' ', '_', '|'},
            {'|', '_', ' '}};
    public static final char[][] THREE = {
            {' ', '_', ' '},
            {' ', '_', '|'},
            {' ', '_', '|'}};
    public static final char[][] FOUR = {
            {' ', ' ', ' '},
            {'|', '_', '|'},
            {' ', ' ', '|'}};
    public static final char[][] FIVE = {
            {' ', '_', ' '},
            {'|', '_', ' '},
            {' ', '_', '|'}};
    public static final char[][] SIX = {
            {' ', '_', ' '},
            {'|', '_', ' '},
            {'|', '_', '|'}};
    public static final char[][] SEVEN = {
            {' ', '_', ' '},
            {' ', ' ', '|'},
            {' ', ' ', '|'}};
    public static final char[][] EIGHT = {
            {' ', '_', ' '},
            {'|', '_', '|'},
            {'|', '_', '|'}};
    public static final char[][] NINE = {
            {' ', '_', ' '},
            {'|', '_', '|'},
            {' ', '_', '|'}};

    private char[][] digit = new char[3][3];

    public char[][] getValue() {
        return digit;
    }

    public void setValue(char[][] digit) {
        this.digit = digit;
    }

    public void print() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(digit[i][j]);
            }
            System.out.println();
        }
    }
}
