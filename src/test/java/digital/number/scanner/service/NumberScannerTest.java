package digital.number.scanner.service;

import parser.Digit;
import parser.LineMatcher;
import parser.LineProcessor;
import parser.Parser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NumberScannerTest extends BaseScannerServiceIntegrationTest {

    protected List<String> performScanning(final String inputFilePath) {

        Path inputDirPath = Paths.get("src", "test", "resources", "testInput").resolve("example");

        try {
            List<String> parsedData = Parser.parse(inputDirPath);
            List<Digit> digits = LineProcessor.process(parsedData);
            List<String> l = LineMatcher.matchAndPrint(digits);
            System.out.println(l);
            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
