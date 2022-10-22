package studentRecordsBackupTree.util;

import studentRecordsBackupTree.bst.BST;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * FileProcessor API to read the input from input files.
 */

public class FileProcessor {

    public <integer> ArrayList<integer> ParseInput(String file_path) {
        ArrayList<Integer> inplist = new ArrayList<Integer>();
        try {
            File myObj = new File(file_path);
            Scanner myReader = null;
            try {
                myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    int data = Integer.parseInt(myReader.nextLine());
                    inplist.add(data);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return (ArrayList<integer>) inplist;
    }
}
