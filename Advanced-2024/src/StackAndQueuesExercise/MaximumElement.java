package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            if (Integer.parseInt(line[0]) == 1) {
                stack.push(Integer.parseInt(line[1]));
            } else if (Integer.parseInt(line[0]) == 2) {
                    stack.pop();
            } else if (Integer.parseInt(line[0]) == 3) {
                System.out.println(Collections.max(stack));

            }

        }

    }
}
