package studentRecordsBackupTree.bst;
import java.lang.Cloneable;

import java.util.ArrayList;

public class Node implements observerInterface,subjectInterface,Cloneable{
    //Declaring the Bnumber and description variables
    private int Bnumber;
    private String description;
    private Node left;
    private Node right;



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
    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            return this;
        }
    }



}
