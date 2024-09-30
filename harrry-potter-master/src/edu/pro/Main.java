package edu.pro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static String cleanText(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)))
                .replaceAll("[^A-Za-z ]", " ")
                .toLowerCase(Locale.ROOT);
    }


    public static String[] getWordsArray(String content) {
        return content.split(" +");
    }

    // підрахунрк кожного слова
    public static Map<String, Integer> calculateWordFrequency(String[] words) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        return wordFrequencyMap;
    }

    public static void printTopFrequentWords(Map<String, Integer> wordFrequencyMap, int topN) {
        wordFrequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(topN)
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();

        String content = cleanText("src/edu/pro/txt/harry.txt");

        String[] words = getWordsArray(content);

        // Сортування масиву слів
        Arrays.sort(words);

        Map<String, Integer> wordFrequencyMap = calculateWordFrequency(words);

        printTopFrequentWords(wordFrequencyMap, 30);

        LocalDateTime finish = LocalDateTime.now();
        System.out.println("------");
        System.out.println(ChronoUnit.MILLIS.between(start, finish));
    }
}
