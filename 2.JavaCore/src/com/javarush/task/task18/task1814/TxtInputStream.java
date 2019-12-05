package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException, IOException {
        super(fileName);
        if (fileName.length() < 5 || (!fileName.substring(fileName.length() - 4, fileName.length()).equals(".txt"))) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
        /*try {
            TxtInputStream txtInputStream = new TxtInputStream("hello.txt");
        } catch (UnsupportedFileNameException exc) {
            exc.printStackTrace();
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }*/
    }
}
