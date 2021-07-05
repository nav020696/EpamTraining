package Streams.CountWords;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("Алексей Александрович вернулся из министерства в четыре часа, но, как это");
        lines.add("часто бывало, не успел войти к ней. Он прошел в кабинет принимать");
        lines.add("часто бывало, не успел войти войти к ней. Он прошел в кабинет принимать");
        Words words = new Words();
        String s = words.countWords(lines);
        System.out.println(s);
    }
}
