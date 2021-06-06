package parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static void main(String[] args) {


        Path inputDirPath = Paths.get("src", "test", "resources", "testInput").resolve("example");
        Parser parser = new Parser();

        try {
            List<String> parsedData = parser.parse(inputDirPath);
            List<Digit> digits = parser.process(parsedData);
            parser.matchAndPrint(digits);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> parse(Path file) throws IOException {

        List<String> lines = Files.readAllLines(file);
        lines.remove("\n");lines.remove("");
        return lines;
    }

    public List<Digit> process(List<String> lines) {

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

    public void matchAndPrint(List<Digit> numbers) {

        for (Digit d : numbers) {

            if (equals(d.getValue(), Digit.ZERO)) {
                System.out.print(0);
            } else if (equals(d.getValue(), Digit.ONE)) {
                System.out.print(1);
            } else if (equals(d.getValue(), Digit.TWO)) {
                System.out.print(2);
            } else if (equals(d.getValue(), Digit.THREE)) {
                System.out.print(3);
            } else if (equals(d.getValue(), Digit.FOUR)) {
                System.out.print(4);
            } else if (equals(d.getValue(), Digit.FIVE)) {
                System.out.print(5);
            } else if (equals(d.getValue(), Digit.SIX)) {
                System.out.print(6);
            } else if (equals(d.getValue(), Digit.SEVEN)) {
                System.out.print(7);
            } else if (equals(d.getValue(), Digit.EIGHT)) {
                System.out.print(8);
            } else if (equals(d.getValue(), Digit.NINE)) {
                System.out.print(9);
            } else if (equals(d.getValue(), Digit.NULL)) {
                System.out.println();
            } else {
                System.out.print("ILL");
            }
        }
    }

    public boolean equals(char[][] a, char[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i][j] != b[i][j])
                    return false;
            }
        }

        return true;
    }

}
