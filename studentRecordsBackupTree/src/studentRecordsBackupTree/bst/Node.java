package studentRecordsBackupTree.bst;

import java.util.ArrayList;

public class Node implements observerInterface,subjectInterface,Cloneable {
    //Declaring the Bnumber and description variables
    int Bnumber;
    String description;
    Node left;
    Node right;
//    Node backup_1;
//    Node backup_2;


//    protected Node clone() throws CloneNotSupportedException {
//        Node node = (Node) super.clone();
//        return node;
//    }
    public Node clone() {

        Node temp = null;
        try {
            temp = (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return temp;
    }

    /**
     * Constructor - Initializes the class variables
     */

    public Node(){
        description = null;
        left = null;
        right = null;
    }
    public Node(Integer bnumberIn){
        Bnumber = bnumberIn;
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
    public void registerObserver(Node ObjIn) {
        //listeners.add(ObjIn);
    }

    /**
     * @param ObjIn
     */
    @Override
    public void unregisterObserver(Node ObjIn) {
        //listeners.remove(ObjIn);
    }

    /**
     * Un Register the backups as observers
     * @param objIn
     */


    /**
     * @param
     */
    @Override
    public void notifyobs() {
        //for(Node obs :  listeners ){
        //    obs.receiveData();
        //}
    }

    /**
     *
     * @param
     */
    @Override
    public void receiveData() {

    }
    public void upload(int bnumberIn){
        Bnumber = bnumberIn;
        notifyobs();
    }




}
