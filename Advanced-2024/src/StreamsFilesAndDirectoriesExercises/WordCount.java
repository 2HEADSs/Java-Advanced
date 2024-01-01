package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String inputPathWords = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\Exercises Resources\\words.txt";
        String inputPathText = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\Exercises Resources\\text.txt";
        String outputPath = "C:\\Programing\\Java-Github\\Java-Advanced\\Advanced-2024\\src\\StreamsFilesAndDirectoriesExercises\\output5.txt";
        Map<String, Integer> wordsCount = new HashMap<>();
        Set<String> wordsForSearch = new HashSet<>();

        try (BufferedReader readerWordsFile = Files.newBufferedReader(Path.of(inputPathWords));
             BufferedReader readerInputFile = Files.newBufferedReader(Path.of(inputPathText));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))
        ) {

            File fileWordsForSearch = new File(inputPathWords);
            Scanner input = new Scanner(fileWordsForSearch);

            while (input.hasNext()) {
                String currentWord = input.next();
                wordsForSearch.add(currentWord);
            }

            File fileWithText = new File(inputPathText);
            Scanner inputText = new Scanner(fileWithText);

            while (inputText.hasNext()) {
                String currentWordFromText = inputText.next();
                if (wordsForSearch.contains(currentWordFromText)) {
                    if (!wordsCount.containsKey(currentWordFromText)) {
                        wordsCount.put(currentWordFromText, 1);
                    } else {
                        int currentCount = wordsCount.get(currentWordFromText);
                        wordsCount.put(currentWordFromText, ++currentCount);
                    }
                }
            }
            Map<String,Integer> sortedMap = wordsCount.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(LinkedHashMap::new,
                            (map, entry)-> map.put(entry.getKey(), entry.getValue()),
                            LinkedHashMap::putAll);
            sortedMap.forEach((key, value) -> {
                try {
                    writer.write(String.format("%s - %d\n",key,value));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(key + " - " + value);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
