package list;

import java.util.*;

public class Solution {

    public static int countOccurance(List<String> words, String text) {

        text = Optional.ofNullable(text).orElse("");
        words = Optional.ofNullable(words).orElse(new ArrayList<>());

        int occurance = 0;

        while (words.contains(text)) {
            words.remove(text);
            occurance++;
        }
        return occurance;
    }

    public static <T> List<T> toList(T[] inputArray) {
        return List.of(inputArray);
    }

    public static List<Integer> findUnique(List<Integer> enterList) {

        enterList = Optional.ofNullable(enterList).orElse(new ArrayList<>());

        List<Integer> result = new ArrayList<>();
        Collection<Integer> repeat = new ArrayList<>();

        for (Integer value : enterList) {
            if (!result.contains(value)) {
                result.add(value);
            } else {
                repeat.add(value);
            }
        }
        result.removeAll(repeat);
        return result;
    }
}

