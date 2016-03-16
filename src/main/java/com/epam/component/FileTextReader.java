package com.epam.component;

import com.epam.textfileexeption.LessThenFiveLineExeption;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by damian on 15.03.16.
 */
public class FileTextReader {
    private OutPutTextArea outPutTextArea;
    private final int MIN_NUMBER_OF_LINES_IN_FILE = 5;

    final String FIVE_LINE_EXCEPTION_MESSAGE = "File has less then 5 line. If you want to print 1,3,5 line you have to have file with more then 5 lines.";

    public FileTextReader(OutPutTextArea outPutTextArea) {
        this.outPutTextArea = outPutTextArea;
    }

    public void read(File file) {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            final Stream<String> lines = bufferedReader.lines();
            Object[] linesArrayO = lines.toArray();
            String[] linesArrayS = Arrays.copyOf(linesArrayO, linesArrayO.length, String[].class);

            if (linesArrayS.length >= MIN_NUMBER_OF_LINES_IN_FILE) {
                outPutTextArea.clear();
                outPutTextArea.appendTextToNextLine(linesArrayS[0]);
                outPutTextArea.appendTextToNextLine(linesArrayS[2]);
                outPutTextArea.appendTextToNextLine(linesArrayS[4]);
            } else {
                throw new LessThenFiveLineExeption(FIVE_LINE_EXCEPTION_MESSAGE);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

