package studentRecordsBackupTree.bst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BSTBuilder {
    private BST main_tree;

    ArrayList<Integer> bst_result,backup_1_result,backup_2_result;

    //constructor

    public ArrayList<Integer> getBst_result() {
        return bst_result;
    }

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
     * Read the input from bstinput.txt and calls insert method.
     *
     */

    public void bstInput(){

         main_tree = new BST();
        //File path for CourseInfo
        String currentpath = new File("").getAbsolutePath();
        String bstinput = currentpath + "/studentRecordsBackupTree/bstinput.txt";
        ArrayList<Integer> bstlist = new ArrayList<Integer>();
        try {
            File myObj = new File(bstinput);
            Scanner myReader = null;
            try {
                myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    int data = Integer.parseInt(myReader.nextLine());
                    bstlist.add(data);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        //calling the bst insert method.
        //try {
        int i;
        Node main_bst_node;
        Node bkup_1_node;
        Node bkup_2_node;
        BST backup_1 = new BST();
        BST backup_2 = new BST();
        for (i = 0; i < bstlist.size(); i++) {
            main_bst_node = new Node(bstlist.get(i));
            main_tree.insert(main_bst_node);
            Node backup_1_node = main_bst_node.clone();
            Node backup_2_node  = main_bst_node.clone();
            backup_1.insert(backup_1_node);
            backup_2.insert(backup_2_node);

        }
        //}
        //catch(Exception e)
        //{
        //    System.err.println("Unable to insert Bnumber due to : "+e);
        //}

        bst_result= main_tree.display_bst();
        backup_1_result = backup_1.display_bst_bkp1();
        backup_2_result = backup_2.display_bst_bkp2();
    }

}