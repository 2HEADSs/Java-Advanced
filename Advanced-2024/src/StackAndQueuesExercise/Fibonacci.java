package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        if (count ==0){
            System.out.println(0);
            return;
        }
        Deque<Integer> nums = new ArrayDeque<>();
        nums.push(1);
        nums.push(1);
        for (int i = 0; i < count-1; i++) {
            int firstNum = nums.pop();
            int secondNum = nums.pop();
            int thirdNum = firstNum +secondNum;
            nums.push(secondNum);
            nums.push(firstNum);
            nums.push(thirdNum);
        }
        System.out.println(nums.pop());

    }
}
