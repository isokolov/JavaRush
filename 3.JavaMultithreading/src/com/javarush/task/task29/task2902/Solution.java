package com.javarush.task.task29.task2902;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Рефакторинг в соответствии с Naming and Code Convention 2
*/
public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        Solution solution = new Solution(); // Solution -> solution
        // name_of_file_to_be_opened_by_notepad
        String nameOfFileToBeOpenedByNotepad = solution.getAbsolutePathToDefaultTxtFile().toString();
        Process notepad = solution.getStartNotepadProcess(nameOfFileToBeOpenedByNotepad); // NOTEPAD -> notepad
        notepad.waitFor();
    }

    public Process getStartNotepadProcess(String fileName) throws IOException { // getstartnotepadprocess, FILE_NAME
        String[] cmdArray = new String[]{"notepad.exe", fileName}; // cmd_array
        return Runtime.getRuntime().exec(cmdArray);
    }

    public Path getAbsolutePathToDefaultTxtFile() throws URISyntaxException { // Getabsolutepathtodefaulttxtfile
        URI uri = Solution.class.getResource("file.txt").toURI(); // uRi
        return  Paths.get(uri);
    }
}
