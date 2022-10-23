package studentRecordsBackupTree.bst;

import studentRecordsBackupTree.util.FileProcessor;
import studentRecordsBackupTree.util.Results;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BSTBuilder {
    private BST main_tree;

    ArrayList<Integer> bst_result,bst_incr_result,backup_1_result,backup_2_result,bst_bkup1_incr_result,bst_bkup2_incr_result;

    //constructor

    public ArrayList<Integer> getBst_result() {
        return bst_result;
    }

    public ArrayList<Integer> getIncrBst_result() {
        return bst_incr_result;
    }
    BST backup_1 = new BST();

    public ArrayList<Integer> getBst_bkup1_incr_result() {
        return bst_bkup1_incr_result;
    }

    public ArrayList<Integer> getBst_bkup2_incr_result() {
        return bst_bkup2_incr_result;
    }

    BST backup_2 = new BST();
    public void setBst_result(ArrayList<Integer> bst_result) {
        this.bst_result = bst_result;
    }

    public ArrayList<Integer> getBackup_1_result() {
        return backup_1_result;
    }

    public void setBackup_1_result(ArrayList<Integer> backup_1_result) {
        this.backup_1_result = backup_1_result;
    }

    public ArrayList<Integer> getBackup_2_result() {
        return backup_2_result;
    }

    public void setBackup_2_result(ArrayList<Integer> backup_2_result) {
        this.backup_2_result = backup_2_result;
    }

    public BSTBuilder(BST bstIn){
        main_tree = bstIn;
    }

    /**
     * Use File Processor API to get the input and Build the main tree, backup_1 and backup_2
     */




    public void bstInput() {

        try {
            main_tree = new BST();
            //File path for CourseInfo
            String currentpath = new File("").getAbsolutePath();
            String bstinput = currentpath + "/studentRecordsBackupTree/bstinput.txt";
            ArrayList<Integer> bstInplist = new ArrayList<Integer>();
            FileProcessor fp = new FileProcessor();
            bstInplist = fp.ParseInput(bstinput);
            int i;
            Node main_bst_node;
            Node bkup_1_node;
            Node bkup_2_node;
            Node node = new Node();
            for (i = 0; i < bstInplist.size(); i++) {
                main_bst_node = new Node(bstInplist.get(i));
                main_tree.insert(main_bst_node);
                Node backup_1_node = main_bst_node.clone();
                //Register backup 1 as Observer
                node.registerObserver(backup_1_node);
                Node backup_2_node = main_bst_node.clone();
                //Register backup 2 as Observer
                node.registerObserver(backup_2_node);
                PopulateBackups populate = new PopulateBackups();

                backup_1.insert(backup_1_node);
                backup_2.insert(backup_2_node);
            }
            bst_result = main_tree.display_bst();
            bst_incr_result = main_tree.increment_bst();


            //After Incrementing the main tree notify the backups about update.
            node.notifyobs();


            backup_1_result = backup_1.display_bst_bkp1();
            backup_2_result = backup_2.display_bst_bkp2();
            bst_bkup1_incr_result = backup_1.increment_bst();
            bst_bkup2_incr_result = backup_2.increment_bst();

        } catch (Exception e) {
            String bstErr = "Error Genarating BST's :" + e + ", Please,try again";
            Results conf = new Results();
            conf.writeError(bstErr);
        }
    }

    /**
     * To String method for the class BSTBuilder
     */
    @Override
    public String toString() {
        return "BSTBuilder{" +
                "main_tree=" + main_tree +
                ", bst_result=" + bst_result +
                ", backup_1_result=" + backup_1_result +
                ", backup_2_result=" + backup_2_result +
                '}';
    }
}