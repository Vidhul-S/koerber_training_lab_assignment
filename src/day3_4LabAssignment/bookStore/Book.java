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

        System.out.print(this.bookTitle+":"+this.author+":"+this.ISBN+":"+this.noOfCopies+":"+this.price+"per piece");
    }
//    String out(){
//        return StringBuilder()
//    }
    void addToFile(Book book){
        try(BufferedWriter fo = new BufferedWriter(new FileWriter("C:\\Users\\vidhul.s\\IdeaProjects\\Koreber Training\\src\\day3_4LabAssignment\\bookStore\\library.txt"));){


        }
        catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
