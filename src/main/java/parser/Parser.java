package parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Parser {

    public static void main(String[] args) throws Exception {

        Path inputDirPath = Paths.get("src", "test", "resources", "testInput").resolve("example");
        List<String> parsedData = Parser.parse(inputDirPath);
        List<Digit> digits = LineProcessor.process(parsedData);
        LineMatcher.matchAndPrint(digits);

    }

    public static List<String> parse(Path file) throws IOException {

        List<String> lines = Files.readAllLines(file);
        lines.remove("\n");
        lines.remove("");
        return lines;
    }

}
