package EvgenyT.SingletonDemo;

import EvgenyT.SingletonDemo.anotherpack.AnotherClass;

/**
 * Singleton pattern sample: Simple log-file writer
 * that can be accessed from any point of program
 * Feb 2019 Evgeny Tyurin
 */

public class SingletonDemo {
    /** Run point */
    public static void main(String[] args) {
        // New logger for whole app
        LogWriter txtWriter = LogWriter.getInstance();
        // Write here
        txtWriter.write("Test line one");
        txtWriter.write("Another test line");
        // Write there
        AnotherClass.doSomething();
        // Exit program
        txtWriter.close();
    }
}
