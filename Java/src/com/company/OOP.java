package com.company;

class Emp
{   static int i=0;
    int eid;
    int salary;
    static String ceo;

    public Emp()  // when you create an object
    {
        eid = 1;
        salary = 3000;
        System.out.println("in constructor " +i);
    }


    static    // when you load a class
    {   i++;
        ceo = "Larry";
        System.out.println("in static"+i);
    }


    public void show()
    {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class OOP
{

    public static void main(String[] args)
    {


        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;
        Emp.ceo = "Mahesh";

        Emp rahul = new Emp();
        rahul.eid = 9;
        rahul.salary = 5000;
        Emp.ceo = "Mahesh";   // we dont need object

        Emp.ceo = "Nikita";

        navin.show();
        rahul.show();
    }

}