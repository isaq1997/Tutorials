package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Course c1=Course.createcourse("Math");
        c1.addStudent("Pedro Londa");
        c1.addStudent("Magnus Oilesen");
        c1.addStudent("Sam Hancock");
        String[]all= c1.getStudents();
        for (int i=0;i<c1.getNumOfStudents();i++){
            System.out.println(all[i]);
        }
        File file = new File("C:\\Users\\huseynliir\\Desktop\\scores.txt");

        System.out.println(c1.getNumOfStudents());

    }
}
