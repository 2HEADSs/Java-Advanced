package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstLine = (scanner.nextLine().split(" "));
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int[]numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        ArrayDeque<Integer> stackOfNums  = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stackOfNums.push((numbers[i]));
        }

        for (int i = 1; i <= s; i++) {
            stackOfNums.pop();
        }
        int minMalue = Integer.MAX_VALUE;
        boolean present = false;
        if(stackOfNums.isEmpty()){
            minMalue = 0;
        }else {
            while (!stackOfNums.isEmpty()){
                int currentNum = stackOfNums.poll();
                if(currentNum < minMalue){
                    minMalue = currentNum;
                }
                if(currentNum ==x){
                    present = true;
                }
            }
        }

        if(present){
            System.out.println(true);
        }else {
            System.out.println(minMalue);
        }

    }
}
