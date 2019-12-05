package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter /*extends FileWriter*/ {

    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        //super(fileName);
        fileWriter = new FileWriter(fileName);
        //super(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        //super(fileName, append);
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        //super(file);
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        //super(file, append);
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        //super(fd);
        fileWriter = new FileWriter(fd);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.print(new String(cbuf, off, len)); /* cbuf[] char with offset */
        /*for (int i = 0; i < len; i++) {
            System.out.print(cbuf[off]);
            off++;
        }*/
        //System.out.println(cbuf);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len)); /* important off + len */
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(cbuf);
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public static void main(String[] args) {

    }

}
