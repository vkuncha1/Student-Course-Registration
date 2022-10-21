package studentRecordsBackupTree.bst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BSTBuilder {
    BST bst;
    BST backup_1;
    BST backup_2;




    //constructor

    public BSTBuilder(BST bstIn){
        bst = bstIn;

    }


    /**
     * Read the input from bstinput.txt and calls insert method.
     *
     */

    public void bstInput() throws CloneNotSupportedException {

         bst = new BST();

//        BST backup_1 = new BST();
//        BST backup_2 = new BST();




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
        for (i = 0; i < bstlist.size(); i++) {
            bst.insert(bstlist.get(i));
        }
        //}
//        catch(Exception e)
//        {
//            System.err.println("Unable to insert Bnumber due to : "+e);
//        }
        backup_1 =  bst.clone();
        backup_2 = bst.clone();
        bst.display_bst();
//        backup_1.display_bst();
//        backup_2.display_bst();
    }

}