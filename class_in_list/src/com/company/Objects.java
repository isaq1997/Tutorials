package com.company;

public class Objects {
    private int id;
    private  String name;

    public Objects(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  int get_default(){
        return  5;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
