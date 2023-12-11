package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allKids = scanner.nextLine().split("\\s+");
        Integer rounds = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kidsCircle = new ArrayDeque<>();
        for (int i = 0; i < allKids.length; i++) {
            kidsCircle.offer(allKids[i]);
        }

        while (kidsCircle.size() > 1) {
            for (int i = 1; i < rounds; i++) {
                kidsCircle.offer(kidsCircle.poll());
            }
            System.out.println("Removed " + kidsCircle.poll());
        }
        System.out.println("Last is " + kidsCircle.poll());


    }
}
