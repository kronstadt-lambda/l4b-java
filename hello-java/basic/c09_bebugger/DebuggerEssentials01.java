package basic.c09_bebugger;

import java.io.IOException;

/**
 * DEBUGGING AND DEBUGGER CONCEPTS:
 * <p>
 * Debug:
 * - Debug is the process of finding and fixing errors (bugs) in software.
 * - It involves identifying, isolating, and correcting problems in code.
 * - It allows developers to do a code analysis. So, it allows knowing what parts of the code are executed.
 * - Can be done through various methods like print statements, logging, or using a debugger.
 * <p>
 * Debugger:
 * - A debugger is a software tool that helps in debugging process.
 * - Allows developers to execute code step by step, inspect variables, and control program flow.
 * - Provides features like breakpoints, variable inspection, and call stack analysis.
 * <p>
 * Key differences:
 * - Debug is the process/action, while debugger is the tool used for debugging.
 * - Debug can be done without a debugger (e.g., using print statements).
 * - Debugger provides specialized features making debugging more efficient.
 */

public class DebuggerEssentials01 {
    public static void main(String[] args) throws IOException {
        while (true) {
            int read = System.in.read();
            System.out.println("Input " + read);
            if (filter(read)) {
                process(read);
            }
        }
    }

    public static boolean filter(int read) {
        return read != '\n'&& read != 'a';
    }

    public static void process(int arg) {
        if (Math.max(arg,90) % 2 == 0) {
            System.out.println("!");
        }
    }
}
