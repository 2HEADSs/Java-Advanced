package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FibonacciWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        if (count ==1){
            System.out.println(1);
            return;
        }
        Deque<Integer> nums = new ArrayDeque<>();
        nums.push(1);
        for (int i = 0; i < count; i++) {
            int firstNum = nums.pop();
            int secondNum = 0;
            if(!nums.isEmpty()){
                secondNum = nums.pop();
            }
            int thirdNum = firstNum +secondNum;
            nums.push(secondNum);
            nums.push(firstNum);
            nums.push(thirdNum);
        }
        System.out.println(nums.pop());

    }
}
