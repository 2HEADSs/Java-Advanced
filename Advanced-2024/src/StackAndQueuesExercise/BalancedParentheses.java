package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("");
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        boolean balanced = false;
        if (line.length % 2 != 0) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < line.length; i++) {
            stack.push(line[i]);
            queue.offer(line[i]);
        }
        for (int i = 0; i < line.length / 2; i++) {
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
