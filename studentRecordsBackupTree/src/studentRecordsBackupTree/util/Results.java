package studentRecordsBackupTree.util;

/**
 * Results class implements StdoutDisplayInterface and FileDisplayInterface
 * to write into output files
 * @author  Venkata Achyuth Kunchapu
 *
 */

import studentRecordsBackupTree.bst.BST;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {

    //Writing Error File

    public void writeError(String errorIn) {
        try {
            String currentpath = new File("").getAbsolutePath();
            String regErrorPath = currentpath + "/errorLog.txt";
            FileWriter regResults = new FileWriter(regErrorPath, true);
            regResults.write(errorIn + System.lineSeparator());
            regResults.close();
        } catch (Exception ex) {
            System.err.println("Error in writing into Error File: " + ex);
        }
    }

    public int get_sum(ArrayList<Integer> arrIn) {
        int sum_of_nodes = 0;
        for (int j = 0; j < arrIn.size(); j++) {
            sum_of_nodes += Integer.valueOf(arrIn.get(j));
        }
        return sum_of_nodes;
    }

    /**
     *
     */
    @Override
    public void FileOutputDisplay(ArrayList<Integer> outputIn, String bstIn) {
        try {
            String currentpath = new File("").getAbsolutePath();
            String regErrorPath = currentpath + "/bstOutput.txt";
            FileWriter regResults = new FileWriter(regErrorPath, true);
            if (bstIn.equals("BST")) {
                regResults.write("// Inorder traversal" + System.lineSeparator());
                regResults.write("BST: " + outputIn.toString().replace("[", "").replace("]", "") + System.lineSeparator());
            }
            if (bstIn.equals("backup_1")) {
                regResults.write("backup_1: " + outputIn.toString().replace("[", "").replace("]", "") + System.lineSeparator());
            }
            if (bstIn.equals("backup_2")) {
                regResults.write("backup_2: " + outputIn.toString().replace("[", "").replace("]", "") + System.lineSeparator());
                regResults.write(System.lineSeparator());
                regResults.write(System.lineSeparator());
            }
            regResults.close();

        } catch (Exception ex) {
            System.err.println("Error in writing into Error File: " + ex);
        }
    }

    public void FileOutputSum(ArrayList<Integer> outputIn, String bstIn) {
        try {
            String currentpath = new File("").getAbsolutePath();
            String regErrorPath = currentpath + "/bstOutput.txt";
            FileWriter regResults = new FileWriter(regErrorPath, true);

            if (bstIn.equals("BST")) {
                regResults.write("// Sum of all the B-Numbers in each tree" + System.lineSeparator());
                regResults.write("BST: " + get_sum(outputIn) + System.lineSeparator());
            }
            if (bstIn.equals("backup_1")) {
                regResults.write("backup_1: " + get_sum(outputIn) + System.lineSeparator());
            }
            if (bstIn.equals("backup_2")) {
                regResults.write("backup_2: " + get_sum(outputIn) + System.lineSeparator());
                regResults.write(System.lineSeparator());
                regResults.write(System.lineSeparator());
            }
            regResults.close();
        } catch (Exception ex) {
            System.err.println("Error in writing into Error File: " + ex);
        }
    }

    /**
     * @param bstIn
     */
    @Override
    public void TerminalOutput(BST bstIn) {
        try {
            String currentpath = new File("").getAbsolutePath();
            String regErrorPath = currentpath + "/errorLog.txt";
            FileWriter regResults = new FileWriter(regErrorPath, true);
            //regResults.write(errorIn+ System.lineSeparator());
            regResults.close();
        } catch (Exception ex) {
            System.err.println("Error in writing into Error File: " + ex);
        }
    }
}