package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allKids = scanner.nextLine().split("\\s+");
        Integer rounds = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kidsCircle = new PriorityQueue<>();
        for (int i = 0; i < allKids.length; i++) {
            kidsCircle.offer(allKids[i]);
        }

        System.out.println(kidsCircle);
        int cycle = 1;

        while (kidsCircle.size() > 1) {
            for (int i = 1; i < rounds; i++) {
                kidsCircle.offer(kidsCircle.poll());

            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + kidsCircle.peek());
            } else {
                System.out.println("Removed " + kidsCircle.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + kidsCircle.poll());

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}
