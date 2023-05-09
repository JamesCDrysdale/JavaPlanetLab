package org.example;

public class Planet {
    String name;
    int size;

    // Constructor
    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String explode(){
        return "Kaboom!";
    }


}
