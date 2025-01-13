package day3_4LabAssignment.bookStore;

import java.io.BufferedWriter;
import java.io.FileWriter;

class Book {

    String bookTitle,author,ISBN;
    int noOfCopies;
    double price;
    public Book(){}
    public Book(String bookTitle, String author, String ISBN, int noOfCopies,double price) {

        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN ;
        this.noOfCopies = noOfCopies;
        this.price = price;
    }
    void display(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.ISBN).append(":").append(this.bookTitle).append(":").append(this.author).append(":").append(this.noOfCopies).append(":").append(this.price);
        System.out.print(sb.toString());
    }
    String out(){

        StringBuilder sb = new StringBuilder();
        return sb.append(this.ISBN).append(":").append(this.bookTitle).append(":").append(this.author).append(":").append(this.noOfCopies).append(":").append(this.price).toString();
    }
    void addToFile(Book book){
        try(BufferedWriter fo = new BufferedWriter(new FileWriter("C:\\Users\\vidhul.s\\IdeaProjects\\Koreber Training\\src\\day3_4LabAssignment\\bookStore\\library.txt"));){


        }
        catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
