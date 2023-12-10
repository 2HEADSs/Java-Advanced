
package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String current = "";

        ArrayDeque<String> history = new ArrayDeque<>();
        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!history.isEmpty()) {
                    current = history.pop();
                }
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    history.push(current);
                } else {
                    String newCurrent = history.pop();
                    System.out.println(newCurrent);
                    history.push(newCurrent);
                }
            } else {
                System.out.println(line);
                history.push(line);
            }

            line = sc.nextLine();
        }
    }
}
