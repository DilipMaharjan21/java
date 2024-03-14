package com.dilip.processingFiles;

import com.dilip.exception.FooRunTimeException;

public class MyFileUtils {

    public int subtract10FromLargerNumber(int number) throws FooRunTimeException {
        if(number < 10){
            throw new FooRunTimeException("The passing number is smaller than 10");
        }
        return number -10;
    }

}
