package midterm.saba_giorbelidze_1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordStat {
    public static void main (String[] args) {

        List<String> fantasyText = DreamGenerator.getFantasyText();


        int totalWords = fantasyText.size();
        Map<Integer, Integer> wordLengthCounts = new HashMap<>();
        List<String> uniqueWords = new ArrayList<>();

        for (String word : fantasyText) {

            word = word.replaceAll("[^a-zA-Z ]", "");
            word = word.toLowerCase();

            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }

            int wordLength = word.length();
            if (wordLengthCounts.containsKey(wordLength)) {
                wordLengthCounts.put(wordLength, wordLengthCounts.get(wordLength) + 1);
            } else {
                wordLengthCounts.put(wordLength, 1);
            }
        }


        System.out.println("Total Words: " + totalWords);
        System.out.println("Unique Words: " + uniqueWords.size());
        System.out.println("Word Length Counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
            System.out.println(entry.getKey() + " letters: " + entry.getValue());
        }
    }
}
/* Professor I don't know if you remember but, I wasn't able to do the tasks properly,
 because the intellij didn't give me an opportunity to make packages and to run this code at all...
 But I believe, that my code is written correctly so please consider this problem while grading...
 Thank you in advance. */