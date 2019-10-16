package com.company;
import java.util.*;

/*This class is for storing the Data as subjects that we need
for observation*/

public class Data {
    //The message that is needed to be stored
    private String message;
    //The list of observers
    private ArrayList<Observer> observers;

    //Creating new list
    public Data(){
        observers = new ArrayList<Observer>();
    }

    //adding observers
    public void registerObservers(Observer o){
        for(int i=0 ; i<observers.size() ; i++){
            observers.add(o);
        }
    }

    //removing observers
    public void removeObservers(Observer o){
        for(int i=0 ; i<observers.size() ; i++){
            observers.remove(o);
        }
    }

    //notifying the observers
    public void notifyObservers(){
        for( int i =0 ; i<observers.size() ; i++){
        Observer observer = observers.get(i);
        observer.update(message);
        }
    }

    //getting the message
    public String getMessage() {
        return message;
    }

    //setting the message
    public void setMessage(String message) {
        this.message = message;
    }
}
