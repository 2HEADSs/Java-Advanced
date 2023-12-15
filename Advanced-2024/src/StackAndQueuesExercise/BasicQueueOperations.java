package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queueOfNums = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queueOfNums.offer(numbers[i]);
        }
        
        for (int i = 0; i < s; i++) {
            queueOfNums.poll();
        }

        if (queueOfNums.contains(x)) {
            System.out.println(true);
        } else if (queueOfNums.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(queueOfNums));
        }
    }
}
