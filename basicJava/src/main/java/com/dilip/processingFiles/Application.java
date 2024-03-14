package com.dilip.processingFiles;

public class Application {
    //public static void main(String[] args) throws MyFileUtils.FooRunTimeException {
    public static void main(String[] args){
        try {
            MyFileUtils myFileUtils = new MyFileUtils();
            System.out.println(myFileUtils.subtract10FromLargerNumber(9));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
