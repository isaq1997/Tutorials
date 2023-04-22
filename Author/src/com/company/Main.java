package com.company;

public class Main {

    public static void main(String[] args) {
        Author[] ahTeck=new Author[2];
        ahTeck [0]= new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        ahTeck [1]= new Author("Mark Bemm", "ahteck@nowhere.com", 'm');
        Book b1=new Book("Book1",ahTeck,23,1);
       // System.out.println(b1.getName());
        System.out.println(b1);
      //  System.out.println(b1.getAuthors());
    }
}
