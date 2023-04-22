package com.company;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {

        Map<Integer,String> hash=new HashMap<Integer,String>();
        hash.put(1,"hello");
        hash.put(2,"Welcome");
        for(Integer i :hash.keySet()){
            System.out.println("Key: "+i+" Value: "+ hash.get(i));

        }
	// write your code here
    }
}
