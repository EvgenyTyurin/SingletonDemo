package EvgenyT.SingletonDemo.anotherpack;

import EvgenyT.SingletonDemo.LogWriter;

public class AnotherClass {
    public static void doSomething() {
        LogWriter txtWriter = LogWriter.getInstance();
        txtWriter.write("Text from far point of program");
    }
}
