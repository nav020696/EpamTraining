package CollectionsCountWords;

import java.util.*;

public class Words {

    Map<String, Integer> map = new TreeMap<>();

    public String countWords(List<String> lines) {
        for (String string: lines) {
            String stringNew = string.replaceAll("[^A-Za-zА-Яа-я ]", " ").toLowerCase(Locale.ROOT);
            String[] words = stringNew.split(" ");
            List<String> list = Arrays.asList(words);
            for (String str: list) {
                if (str.length() >= 4){
                    map.put(str, map.getOrDefault(str, 0) + 1);
                }
            }
        }
        removeFromMap();
        Map<String, Integer> result = sortByValue(map);
        return ResultToString(result);
    }

    private String ResultToString (Map<String, Integer> map){
        StringBuilder result = new StringBuilder();
        boolean isFirst = true;
        String separator = "\n";
        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            if (isFirst){
                result.append(pair.getKey()).append(" - ").append(pair.getValue());
                isFirst = false;
                continue;
            }
            result.append(separator).append(pair.getKey()).append(" - ").append(pair.getValue());
        }
        return result.toString();
    }

    //remove pairs where value less than 10
    private void removeFromMap(){
        List<String> list = new ArrayList<>();
        for (Map.Entry <String, Integer> pair: map.entrySet()) {
            if (pair.getValue() < 10){
                list.add(pair.getKey());
            }
        }
        for (String str: list) {
            map.remove(str);
        }
    }

    public static <String, Integer extends Comparable<? super Integer>> Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int res = o1.getValue().compareTo(o2.getValue());
                if (res == 0){
                    return o2.getKey().toString().compareTo(o1.getKey().toString());
                }
                return res;
            }
        });
        Collections.reverse(list);

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}


