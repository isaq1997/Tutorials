package com.company;

import java.util.ArrayList;

public class Main extends Objects {


    public Main(int id, String name) {
        super(id, name);
    }
    @Override
    public int get_default(){
        return 4;
    }
    public static void main(String[] args) {
	ArrayList<Main> obj=new ArrayList<>();
    obj.add(new Main(1,"Ulloa"));
    obj.get(0).setName("Goku");
    System.out.println(obj.get(0).getName());


    }
}
