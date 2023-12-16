package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> stackforReturnCommands = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split("\\s+");
            String currentCommand = commandLine[0];
            switch (currentCommand) {
                case "1":
                    String appends = commandLine[1];
                    stack.push(appends);
                    if(i == 0){
                        stackforReturnCommands.push("");
                    }
                    stackforReturnCommands.push(appends);

                    break;
                case "2":
                    int countErases = Integer.parseInt(commandLine[1]);
                    String currentText = stack.pop();
                    int countAfterEdit = currentText.length() - countErases;
                    currentText = currentText.substring(0, countAfterEdit);
                    stack.push(currentText);
                    stackforReturnCommands.push(stack.peek());
                    break;
                case "3":
                    String[] lastText = stack.peek().split("");
                    int indexForReturn = Integer.parseInt(commandLine[1]);
                    System.out.println(lastText[indexForReturn-1]);
                    break;
                case "4":
                    stackforReturnCommands.pop();
                    stack.push(stackforReturnCommands.peek());
                    break;
            }


        }
    }
}
