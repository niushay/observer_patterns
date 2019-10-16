package com.company;

public class Student implements Observer{
    private String message;
    public Student(Data data){
        data.registerObservers(this);
    }

    //updating the new message
    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    //displaying the message
    @Override
    public void display() {
        System.out.println(this.message);
    }
}
