package com.dandelion.pojo;

// Book的实体类
public class Book {

    private int id;
    private String name;
    private String author;
    private String press;
    private String date;
    private String ISBN;

    public Book() {
    }

    public Book(int id, String name, String author, String press, String date, String ISBN) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.date = date;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", date='" + date + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
