package com.dilip.learningFileReader;

import java.io.*;

public class Application {

    public static void main(String[] args) {
        File file = new File("myfileWrong.txt");

        try (FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {

/*            bufferedReader = new BufferedReader(fileReader);
            fileReader = new FileReader(file);*/

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Problem reading the file " + file.getName());
        } /*finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

                if (fileReader != null) {
                    fileReader.close();
                }

            } catch (IOException e) {
                System.out.println("Unable to close file " + file.getName());
            } catch (NullPointerException ex) {
                System.out.println("file was probably never opened " + ex);
            }

        }*/
    }
}

