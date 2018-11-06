package com.hch.exception;

/**
 * Created by haithem.ben-chaaben on 05/11/2018.
 */
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }
}
