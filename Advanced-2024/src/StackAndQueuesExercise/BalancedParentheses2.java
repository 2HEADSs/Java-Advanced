package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BalancedParentheses2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] line = scanner.nextLine().split("");
        List<String> line = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        boolean balanced = false;
        if (line.size() % 2 != 0) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < line.size(); i++) {
            stack.push(line.get(i));
            queue.offer(line.get(i));
        }
        for (int i = 0; i < line.size() / 2; i++) {
            String currentStackString = stack.pop();
            String currentQueueString = queue.poll();
            switch (currentStackString) {
                case "}":
                    if (currentQueueString.equals("{")) {
                        balanced = true;
                    } else {
                        balanced = false;
                    }
                    break;
                case "]":
                    if (currentQueueString.equals("[")) {
                        balanced = true;
                    } else {
                        balanced = false;
                    }
                    break;
                case ")":
                    if (currentQueueString.equals("(")) {
                        balanced = true;
                    } else {
                        balanced = false;
                    }
                    break;
            }
        }

        String output = balanced ? "YES" : "NO";
        System.out.println(output);
    }
}
