package SetsAndMapsAdvancedExercise;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {

    static Map<String, Integer> types = Map.of("S", 4,
            "H", 3,
            "D", 2,
            "C", 1);

    static Map<String, Integer> power = new HashMap<>(Map.of("2", 2,
            "3", 3,
            "4", 4,
            "5", 5,
            "6", 6,
            "7", 7,
            "8", 8,
            "9", 9,
            "10", 10,
            "J", 11));


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        power.put("Q", 12);
        power.put("K", 13);
        power.put("A", 14);

        String line = scanner.nextLine();
        Map<String, Set<String>> hands = new LinkedHashMap<>();

        while (!"JOKER".equals(line)) {
            String[] input = line.split(": ");
            String name = input[0];
            String[] cards = input[1].split(", ");
            if (hands.containsKey(name)) {
                Set<String> currentHand = hands.get(name);
                currentHand.addAll(Arrays.asList(cards));
            } else {
                hands.put(name, Arrays.stream(cards).collect(Collectors.toSet()));
            }
            line = scanner.nextLine();
        }


//        for (Map.Entry<String, Set<String>> entrySet : hands.entrySet()) {
//            String playerName = entrySet.getKey();
//            int points = calculatePoints(entrySet.getValue());
//            System.out.printf("%s: %d\n", playerName, points);
//        }
        hands.forEach((key,value)->{
            int points = calculatePoints(value);
            System.out.printf("%s: %d\n", key, points);
        });
    }

    private static int calculatePoints(Set<String> cards) {
        int points = 0;
        for (String card : cards) {
            String cardPower = card.substring(0, card.length() - 1);
            String type = String.valueOf(card.charAt(card.length() - 1));
            points += power.get(cardPower) * types.get(type);
        }


        return points;

    }


}
