package com.company;

public class Main {

    public static void main(String[] args) {

        Data data = new Data();
        Observer std = new Student(data);
        String msg = "design pattern";

        data.setMessage(msg);
        if(!data.getMessage().equals("")){
            data.notifyObservers();
        }

        data.removeObservers(std);
        if(!data.getMessage().equals("")){
            data.notifyObservers();
        }
    }
}
