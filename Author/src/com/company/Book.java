package com.company;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty=0;
    private static String authors;

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        authors=author[0].toString();
        for (int i=1;i<author.length;i++){
            authors=authors+" , "+author[i].toString();
            //System.out.println(authors);

        }
        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + authors +"}"+
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
