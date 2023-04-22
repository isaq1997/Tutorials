package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=133;
        int b=44;
        int c= findmin(a,b);
        System.out.println(c);
    }


    public static int findmin (int x , int y)

    {
        int min;
        if (x<y){
            min=x;
        }
        else

            min=y;

      return  min;
    }
    
}
