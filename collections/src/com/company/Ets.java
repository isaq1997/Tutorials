package com.company;

public class Ets  {
    private int id;
    private String name;

    public Ets(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int compareTo(){
        return Integer.compare(3,3);
    }

   /* public int jj(int x){
        return x+3;
    }*/
}
