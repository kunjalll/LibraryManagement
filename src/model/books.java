package model;

public class books {
    public books(String bookName, String author, int ISBN, int publishedYear) {
        this.bookName = bookName;
        Author = author;
        this.ISBN = ISBN;
        this.publishedYear = publishedYear;
    }

    String bookName;
    String Author;
    int ISBN;
    int publishedYear;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    public void books_format(){
        System.out.println("Name: " + bookName);
        System.out.println("Author: "+ Author);
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Published Year: "+ publishedYear);
    }


}
