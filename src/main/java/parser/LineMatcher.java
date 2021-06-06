package parser;

import java.util.List;

public class LineMatcher {

    /**
     * Matches the input list of Digit(character array) and prints the corresponding number.
     * Prints 'ILL' if the input doesn't match to any digit.
     * @param numbers
     */
    public static void matchAndPrint(List<Digit> numbers) {

        for (Digit d : numbers) {

            if (isEqual(d.getValue(), Digit.ZERO)) {
                System.out.print(0);
            } else if (isEqual(d.getValue(), Digit.ONE)) {
                System.out.print(1);
            } else if (isEqual(d.getValue(), Digit.TWO)) {
                System.out.print(2);
            } else if (isEqual(d.getValue(), Digit.THREE)) {
                System.out.print(3);
            } else if (isEqual(d.getValue(), Digit.FOUR)) {
                System.out.print(4);
            } else if (isEqual(d.getValue(), Digit.FIVE)) {
                System.out.print(5);
            } else if (isEqual(d.getValue(), Digit.SIX)) {
                System.out.print(6);
            } else if (isEqual(d.getValue(), Digit.SEVEN)) {
                System.out.print(7);
            } else if (isEqual(d.getValue(), Digit.EIGHT)) {
                System.out.print(8);
            } else if (isEqual(d.getValue(), Digit.NINE)) {
                System.out.print(9);
            } else if (isEqual(d.getValue(), Digit.NULL)) {
                System.out.println();
            } else {
                System.out.print("ILL");
            }
        }
    }


    /**
     *  Compares the input arraysto each other
     * @param a
     * @param b
     * @return boolean
     */
    public static boolean isEqual(char[][] a, char[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i][j] != b[i][j])
                    return false;
            }
        }
        return true;
    }

}
