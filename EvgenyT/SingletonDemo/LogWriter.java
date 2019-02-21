package EvgenyT.SingletonDemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Singleton class that support log writing from any point of program
 */

public class LogWriter {

    private static final String FILE_NAME = "log.txt";
    private static LogWriter instance;
    private static BufferedWriter bufferedWriter;

    /** Public constructor, calls private constructor if file not open */
    public static LogWriter getInstance(){
        if (instance == null) {
            instance = new LogWriter();
        }
        return instance;
    }

    /** Private constructor, opens new log file for writing */
    private LogWriter(){
        File spoolFile = new File(FILE_NAME);
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(spoolFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes string to log file
     * @param text String to write
     */
    public void write(String text){
        try {
            bufferedWriter.write(text + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Deletes instance an closes log file */
    public void close(){
        instance = null;
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
