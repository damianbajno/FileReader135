package com.epam.component;

import java.io.File;

/**
 * Created by damian on 15.03.16.
 */
public class FileTextReader {
    private OutPutTextArea outPutTextArea;


    public FileTextReader(OutPutTextArea outPutTextArea) {
        this.outPutTextArea = outPutTextArea;
    }

    public void read(File file) {
//
//        FileReader fileReader = null;
//
//        try {
//            fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            Stream<String> lines = bufferedReader.lines();
//
//
//            if (lines.count() < 6) ;
//
//            StringBuilder stringBuilder = new StringBuilder();
//
//            fileReader.close();
//            return stringBuilder.toString();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}

