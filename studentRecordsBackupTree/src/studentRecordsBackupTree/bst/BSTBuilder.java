package studentRecordsBackupTree.bst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BSTBuilder {
    BST bst;

    //constructor

    public BSTBuilder(BST bstIn){
        bst = bstIn;
    }



    /**
     * Read the input from bstinput.txt and calls insert method.
     *
     */

    public void bstInput()  {

        BST bst = new BST();
        //Node node = new Node();


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
                System.out.println("Array List is : " + bstlist);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        //calling the bst insert method.
        try {
            int i;
            for (i = 0; i < bstlist.size(); i++) {
                bst.insert(bstlist.get(i));

            }
        }
        catch(Exception e)
        {
            System.err.println("Unable to insert Bnumber due to : "+e);
        }
        bst.display_bst();
    }

}