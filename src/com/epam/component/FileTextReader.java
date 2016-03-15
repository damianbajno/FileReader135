package com.epam.component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Created by damian on 15.03.16.
 */
public class FileTextReader {
    private TextFile textFile;

    public FileTextReader(TextFile textFile) {
        this.textFile = textFile;
    }

    public String checkReturn() {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(textFile.getFile());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Stream<String> lines = bufferedReader.lines();


            if (lines.count() < 6) ;

            StringBuilder stringBuilder = new StringBuilder();

            fileReader.close();
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
}
