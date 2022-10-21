package studentRecordsBackupTree.bst;

import java.util.ArrayList;

public class Node implements observerInterface,subjectInterface {
    //Declaring the Bnumber and description variables
    int Bnumber;
    String description;
    public Node left;
    public Node right;


    /**
     * Constructor - Initializes the class variables
     */
    public Node(){
        Bnumber = Integer.parseInt(null);
        description = null;
        left = null;
        right = null;
    }


    /**
     * Getters of the class variables.
     */

    public int getBnumber(){

        return Bnumber;
    }

    public String getdescription(){

        return description;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }




    /**
     * Setters of the class variables.
     */

    public void setBnumber(int BnumberIn){

        Bnumber = BnumberIn;
    }

    public void setDescription(String descriptionIn){

        description = descriptionIn;
    }
    public void setLeft(Node leftIn){
        left = leftIn;
    }

    public void setRight(Node rightIn){
        right = rightIn;
    }

    /**
     //     * Register the backups as observers
     //     * @param objIn
     //     */
    @Override
    public void registerObserver(Node objIn) {

    }

    /**
     * Un Register the backups as observers
     * @param objIn
     */
    @Override
    public void unregisterObserver(Node objIn) {

    }

    /**
     *
     * @param objIn
     */
    @Override
    public void receiveData(Node objIn) {

    }




}
