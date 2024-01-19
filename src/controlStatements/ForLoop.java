package controlStatements;

public class ForLoop {
    public static void main(String[] args) {
        /* ****for Loop statements ***
        for (initialization; condition; update) {
          // code block to be executed
        }
         */
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // Nested loops
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
    }
}
