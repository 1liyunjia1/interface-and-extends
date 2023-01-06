package com.library;

/**
 * 用于存储书籍的类 ，书籍具有 名字 ，价格，页数，作者，类型以及在馆书数，留馆书数。
 * 同时使用get和set方法用于查看数据，保证数据的安全与健全。
 */
public class Book {

    private String book_name;

    private String book_actor;
    private int book_price;
    private int number_of_book;
    private int number_of_books_in_the_library;
    public Book next;
    public Book(String book_name, String book_actor, int book_price, int number_of_book, int number_of_books_in_the_library) {
        this.book_name = book_name;
        this.book_actor = book_actor;
        this.book_price = book_price;
        this.number_of_book = number_of_book;
        this.number_of_books_in_the_library = number_of_books_in_the_library;

    }

    @Override
    public String toString() {
        return "Book<<"+book_name+">>\n" +
                "作者为:"+book_actor+"\n" +
                "价格为:"+book_price+"\n" +
                "馆藏数:"+number_of_book+"\n" +
                "在馆数:"+number_of_books_in_the_library;
    }

    public int getNumber_of_book() {
        return number_of_book;
    }

    public void setNumber_of_book(int number_of_book) {
        this.number_of_book = number_of_book;
    }

    public String getBook_actor() {
        return book_actor;
    }

    public void setBook_actor(String book_actor) {
        this.book_actor = book_actor;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public int getNumber_of_books_in_the_library() {
        return number_of_books_in_the_library;
    }

    public void setNumber_of_books_in_the_library(int number_of_books_in_the_library) {
        this.number_of_books_in_the_library = number_of_books_in_the_library;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
}
