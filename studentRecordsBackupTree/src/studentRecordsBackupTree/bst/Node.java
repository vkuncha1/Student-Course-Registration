package studentRecordsBackupTree.bst;
import java.lang.Cloneable;

import java.util.ArrayList;

public class Node implements observerInterface,subjectInterface,Cloneable{
    //Declaring the Bnumber and description variables
    private int Bnumber;
    private String description;
    private Node left;
    private Node right;
    private ArrayList<Node> Observers = new ArrayList<>();


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

    public ArrayList<Node> getObservers() {
        return Observers;
    }

    public void setObservers(Node observersIn) {
        Observers = observersIn.getObservers();
    }

    /**
     //     * Register the backups as observers
     //     * @param objIn
     //     */

    @Override
    public void registerObserver(Node ObjIn) {
        Observers.add(ObjIn);
    }

    /**
     * Un Register the backups as observers
     * @param ObjIn
     */

    @Override
    public void unregisterObserver(Node ObjIn) {
        Observers.remove(ObjIn);
    }

    /**
     * Notify every observer about the update
     * @param ObjIn
     */
    @Override
    public void notifyobs(Node ObjIn) {
        for(Node observer : Observers){
            observer.receiveData(ObjIn);
        }
    }

    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "Bnumber=" + Bnumber +
                ", description='" + description + '\'' +
                '}';
    }


    /**
     *
     */
    @Override
    public Node receiveData(Node  ObjIn) {
        return ObjIn;

    }
}
