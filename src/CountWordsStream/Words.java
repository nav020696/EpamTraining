package Streams.CountWords;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Words {

    public String countWords(List<String> lines) {
        Stream<String> streamFromList = lines.stream();
        List<String> newLine = streamFromList.map((s) -> s.replaceAll("[^A-Za-zА-Яа-я ]", " ").toLowerCase(Locale.ROOT)).collect(Collectors.toList());
        List<String> words = Arrays.stream(newLine.stream().flatMap((p) -> Arrays.stream(p.split(" "))).filter(i -> i.length() >= 4).toArray(String[]::new)).collect(Collectors.toList()); //создание из одной строки массив слов
        Map<String, Integer> map = words.stream().distinct()
                .collect(Collectors.toMap(p -> p, p -> Collections.frequency(words, p)));
        Map<String, Integer> result = map.entrySet().stream().filter(p -> p.getValue() >= 10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); //фильтр по коллекции, не менее 10 повторений
        List<String> listSortedMap = new ArrayList<>();
        result.entrySet().stream().sorted((item1, item2) ->
                !item1.getValue().equals(item2.getValue()) ?  // Если значения не одинаковы...
                        -item1.getValue().compareTo(item2.getValue()) : // то сравниваем по значениям (минус для обратного порядка)
                        item1.getKey().compareTo(item2.getKey()))  // если одинаковы - то сравниваем ключи
                .forEachOrdered(e -> listSortedMap.add(e.getKey() + " - " + e.getValue()));
        String finalResult = listSortedMap.stream().collect(Collectors.joining("\n"));
        return finalResult;
    }
}

