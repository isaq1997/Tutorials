package com.company;

public class Course {
    private String courseName ;
    private String[] students=new String[100];
    private       int numOfStudents=0;

    public static  Course createcourse(String courseName){
        return new Course(courseName);

    }

    public Course(String courseName) {
        this.courseName=courseName;
    }


    public void addStudent(String StudentName){
        students[numOfStudents]=StudentName;
        numOfStudents++;

    }
    public String[] getStudents(){
        return students;
    }

    public int getNumOfStudents (){
        return numOfStudents;
    }

}
