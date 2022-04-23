package BooksMusics;

import BooksMusics.models.Author;

public class Book {
    private Author author;
    private String title;
    private int published;
    private String genre;
    public int counter;

    public Book (){counter++;}

    public Book(Author author, String title, int published, String genre) {
        this.author = author;
        this.title = title;
        this.published = published;
        this.genre = genre;
        counter++;
    }


    public void printInfo (){
        System.out.println("----------- Info ---------");
        System.out.println("Author: " + author.getName());
        System.out.println("Title: " + getTitle());
        System.out.println("Published: " + getPublished());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author birth year: " + author.getBirthYear());
        System.out.println("Author country: " + author.getCountry());
        System.out.println("--------------------------\n");
    }


    //------------------------------   GETTEREK SETTEREK -------------------------------

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
