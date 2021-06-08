package parser;

import java.util.ArrayList;
import java.util.List;

public class LineMatcher {

    /**
     * Matches the input list of Digit(character array) and prints the corresponding number.
     * Prints 'ILL' if the input doesn't match to any digit.
     * @param numbers
     */
    public static List<String> matchAndPrint(List<Digit> numbers) {
        
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Digit d : numbers) {
            
            if (isEqual(d.getValue(), Digit.ZERO)) {
                System.out.print(0);
                sb.append("0");
            } else if (isEqual(d.getValue(), Digit.ONE)) {
                System.out.print(1);
                sb.append("1");
            } else if (isEqual(d.getValue(), Digit.TWO)) {
                System.out.print(2);
                sb.append("2");
            } else if (isEqual(d.getValue(), Digit.THREE)) {
                System.out.print(3);
                sb.append("3");
            } else if (isEqual(d.getValue(), Digit.FOUR)) {
                System.out.print(4);
                sb.append("4");
            } else if (isEqual(d.getValue(), Digit.FIVE)) {
                System.out.print(5);
                sb.append("5");
            } else if (isEqual(d.getValue(), Digit.SIX)) {
                System.out.print(6);
                sb.append("6");
            } else if (isEqual(d.getValue(), Digit.SEVEN)) {
                System.out.print(7);
                sb.append("7");
            } else if (isEqual(d.getValue(), Digit.EIGHT)) {
                System.out.print(8);
                sb.append("8");
            } else if (isEqual(d.getValue(), Digit.NINE)) {
                System.out.print(9);
                sb.append("9");
            } else if (isEqual(d.getValue(), Digit.NULL)) {
                System.out.println();
                list.add(sb.toString());
                sb = new StringBuilder();
            } else {
                System.out.print("ILL");
                sb.append("ILL");
            }
        }
        list.add(sb.toString());
        return list;
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
