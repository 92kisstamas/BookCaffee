package BooksMusics;

import BooksMusics.models.Author;

public class Music {
    private Author author;
    private String title;
    private String genre;
    public int counter;

    public Music(){counter++;}

    public Music(Author author, String title, String genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        counter++;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
