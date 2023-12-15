package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstLine = (scanner.nextLine().split(" "));
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        String [] secondLine = (scanner.nextLine().split(" "));

        ArrayDeque<Integer> stackOfNums  = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stackOfNums.push(Integer.parseInt(secondLine[i]));
        }

        for (int i = 1; i <= s; i++) {
            stackOfNums.pop();
        }

        if(stackOfNums.contains(x)){
            System.out.println(true);
        } else if (stackOfNums.isEmpty()) {
            System.out.println(0);
        }else {
            System.out.println(Collections.min(stackOfNums));
        }

    }
}
