package list;

import javax.sound.midi.Sequence;
import java.util.*;

public class Solution {

    static class Words {
        private String name;
        private int occurence;

        public Words(String name) {
            this.name = name;
        }

        public Words(String name, int occurence) {
            this.name = name;
            this.occurence = occurence;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", occurence=" + occurence +
                    '}' + "\n";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Words words = (Words) o;
            return Objects.equals(name, words.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

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

    public static Map<String, Integer> calcOccurance(List<String> inputSequense) {

        HashMap<String, Integer> result = new HashMap<>();

        for (String line : inputSequense) {
            if (!result.containsKey(line)) {
                int counter = 0;
                for (String value : inputSequense) {
                    if (line.equals(value)) {
                        counter++;
                    }
                }
                result.put(line, counter);
            }
        }
        return result;
    }

    public static List<Words> findOccurance(List<String> inputSequense) {

        List<Words> result = new ArrayList<>();

        for (String line : inputSequense) {
            if (!result.contains(new Words(line))) {
                int counter = 0;
                for (String value : inputSequense) {
                    if (line.equals(value)) {
                        counter++;
                    }
                }
                result.add(new Words(line, counter));
            }
        }
        return result;
    }
}

