package parser;

import java.util.ArrayList;
import java.util.List;

public class LineProcessor {


    /**
     *  Process the input lines and converts into char array
     * @param lines
     * @return List<Digit>   a character array list
     */
    public static List<Digit> process(List<String> lines) {

        List<Digit> numbers = new ArrayList<>();
        int j = 0, column = 0, row = 0;
        String line1, line2, line3;

        for (int i = 0; i < lines.size() / 3; i++) {

            line1 = lines.get(j++);
            line2 = lines.get(j++);
            line3 = lines.get(j++);

            Digit digit = new Digit();
            char[][] number = new char[3][3];
            digit.setValue(number);
            numbers.add(digit);


            for (int k = 0; k < line1.length(); k++) {

                if (column == 3) {
                    column = 0;
                    number = new char[3][3];
                    Digit d = new Digit();
                    d.setValue(number);
                    numbers.add(d);
                }

                number[row][column] = line1.charAt(k);
                number[++row][column] = line2.charAt(k);
                number[++row][column] = line3.charAt(k);

                column++;
                row = 0;
            }

        }
        return numbers;
    }
}
