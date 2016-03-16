package com.epam.textfileexeption;

/**
 * Created by damian on 16.03.16.
 */
public class LessThenFiveLineExeption extends RuntimeException {

    public LessThenFiveLineExeption(String message) {
        super(message);
    }
}
