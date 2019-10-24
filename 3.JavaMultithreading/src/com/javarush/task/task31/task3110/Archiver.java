package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.Command;
import com.javarush.task.task31.task3110.command.ExitCommand;

import java.nio.file.Paths;
import java.util.Scanner;

public class Archiver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to archive file:");
        String archiveFile = scanner.nextLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(archiveFile));
        System.out.println("Enter path wich we need to archive:");
        String targetFile = scanner.nextLine();
        try {
            zipFileManager.createZip(Paths.get(targetFile));
            new ExitCommand().execute();
        } catch (Exception e) {
            e.getLocalizedMessage();
        }


    }
}
