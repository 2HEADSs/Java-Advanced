package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0) {
            System.out.println(0);
            return;
        }
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        while (num != 0) {
            Integer current = num % 2;
            binary.push(current);
            num /= 2;
        }
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
