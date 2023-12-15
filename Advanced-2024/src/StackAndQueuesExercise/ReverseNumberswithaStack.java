package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input =  scanner.nextLine().split("\\s+");
        ArrayDeque<String> numsAsString = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            numsAsString.push(input[i]);
        }

        while (!numsAsString.isEmpty()){
            System.out.print(numsAsString.poll() + " ");
        }

    }
}
