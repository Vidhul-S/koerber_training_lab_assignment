package day3_4LabAssignment.bookStore;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

class BookStore extends Book{
    Book[] books;
    int n;
    public BookStore(String bookTitle, String author, String ISBN, int noOfCopies,double price,Book[] books, int n){

        super(bookTitle,author,ISBN,noOfCopies,price);
        this.n = n;
        this.books = books;
    }
    void sell(String bookTitle, int noOfCopies) {

        int n = this.books.length;
        for (int i = 0; i < n; i++) {

            if (this.books[i].bookTitle.equals(bookTitle) && this.books[i].noOfCopies != 0) {

                this.books[i].noOfCopies -= noOfCopies;
                System.out.println("Collect amount"+super.price);
            } else {

                System.out.println("Book not found");
            }
        }
    }

    void purchaseBook(String ISBN,int noOfCopies){

        int c=0;
        for (int i = 0; i < n; i++) {

            if (this.books[i].ISBN.equals(ISBN) && this.books[i].noOfCopies != 0){

                c++;
                this.books[i].noOfCopies += noOfCopies;
            }
        }
        if(c==0){

            Scanner s = new Scanner(System.in);
            System.out.println("Enter book Title");
            String bookTitle = s.nextLine();
            System.out.println("Enter Author's name");
            String author = s.nextLine();
            //books [] = [this.books,new Book(bookTitle,author,ISBN,noOfCopies)]; can't be done in java
            Book[] booksCopy = new Book[n+1];
            for (int i = 0; i < n+1; i++) {
                if(i!=n) {
                    booksCopy [i] = this.books[i];
                }
                else{
                    System.out.println("Enter cost price of a single book");
                    double price = s.nextDouble();
                    booksCopy [i] = new Book(bookTitle,author,ISBN,noOfCopies,price);
                }
            }
            this.books = booksCopy;
        }
    }

    void display(){
        for (int i = 0; i < n; i++) {
            books[i].display();
        }
    }
}
