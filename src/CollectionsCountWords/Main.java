package CollectionsCountWords;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;

public class Main {
    public static void main(String[] args) throws IOException {
        final List<String> lines = Stream.concat(
                Files.lines(Paths.get("src", "test", "resources", "WAP12.txt"), Charset.forName("windows-1251")),
                Files.lines(Paths.get("src", "test", "resources", "WAP34.txt"), Charset.forName("windows-1251"))
        ).collect(Collectors.toList());
        System.out.println(new Words().countWords(lines));
    }
    private static String readPathToString(final Path path) {
        try {
            return String.join("\n", readAllLines(path, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}